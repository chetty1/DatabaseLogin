package databaselogin;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Random;

import com.sun.activation.registries.MailcapParseException;
import org.jfree.chart.*;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.IntegerDocument;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.clusterers.SimpleKMeans;
import weka.core.*;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Add;

/**
 * Created by Kesh on 2016/05/05.
 */
public class RiskEngine {

    private SimpleKMeans kmeans;
    private Instances data;
    private XYSeries loginAtt;
    private XYSeries risk[];

    public RiskEngine(String filename,int num_of_clusters) throws Exception {
        kmeans = new SimpleKMeans();
        kmeans.setNumClusters(num_of_clusters);
        BufferedReader datafile = readDataFile(filename);
        data = new Instances(datafile);
        loginAtt = new XYSeries("New Login Attempt");
        risk = new XYSeries[3];

    }

    private static BufferedReader readDataFile(String filename) {

        BufferedReader inputReader = null;

        try {
            inputReader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException ex) {
            System.err.println("File not found: " + filename);
        }

        return inputReader;
    }

    public int calculateRisk(double[] instanceValues) throws Exception {

        kmeans.setSeed(10);
        //important parameter to set: preserver order, number of cluster.
        kmeans.setPreserveInstancesOrder(true);


        double[] value= data.firstInstance().toDoubleArray();
        System.out.println("firstInstance:"+value[0]);


        Instance denseInstance = new Instance(1.0, instanceValues);
        data.add(denseInstance);

        int sizeOfArray = denseInstance.toDoubleArray().length;


        loginAtt.add(instanceValues[instanceValues.length-2],instanceValues[instanceValues.length-1]);


        kmeans.buildClusterer(data);
        // This array returns the cluster number (starting with 0) for each instance
        // The array has as many elements as the number of instances
        int[] assignments = kmeans.getAssignments();
        int i=0;



        Instances centroids = kmeans.getClusterCentroids();

        double risk_score[]=new double[kmeans.getNumClusters()];

        for(int in=0;in<risk_score.length;in++)
            risk_score[in]=0;

        int[] cluster_size=kmeans.getClusterSizes();
        for(int index=0;index<kmeans.getNumClusters();index++){
            for(int inner_index=0;inner_index<assignments.length;inner_index++){
                if(assignments[inner_index]==index){
                    risk_score[index]+=kmeans.getDistanceFunction().distance(centroids.instance(index),data.instance(inner_index));
                }
            }

            if(cluster_size[index]!=0)
                risk_score[index]/=cluster_size[index];

            if(risk_score[index]==0)
                risk_score[index]=100000;

            System.out.print("Cluster "+index+" risk score:"+risk_score[index]+"\n");
        }

        i=0;
        int clusterInstance = 0;
        for(int clusterNum : assignments) {
            if(i==data.numInstances()-1){
                System.out.printf("Instance %d -> Cluster %d \n", i, clusterNum);
                clusterInstance=clusterNum;
            }
            i++;
        }

        LinkedHashMap<Double,Integer> risk_per_cluster = new LinkedHashMap<Double,Integer>();
        risk_per_cluster.put(risk_score[0],0);
        risk_per_cluster.put(risk_score[1],1);
        risk_per_cluster.put(risk_score[2],2);


        double instanceRisk = risk_score[clusterInstance];
        int totalRisk = 0;
        Arrays.sort(risk_score);
        for(int j=0;j<risk_score.length;j++){
            if(risk_score[j]==instanceRisk)
                totalRisk = j + 1;

        }

        System.out.println("Risk of instance:"+totalRisk);

        risk[risk_per_cluster.get(risk_score[0])]=new XYSeries("Risk 1");
        risk[risk_per_cluster.get(risk_score[1])]=new XYSeries("Risk 2");
        risk[risk_per_cluster.get(risk_score[2])]=new XYSeries("Risk 3");

        i=0;
        for(int clusterNum : assignments) {

            switch(clusterNum){
                case 0:
                    risk[0].add(data.instance(i).toDoubleArray()[instanceValues.length-2],data.instance(i).toDoubleArray()[instanceValues.length-1]);
                    break;
                case 1:
                    risk[1].add(data.instance(i).toDoubleArray()[instanceValues.length-2],data.instance(i).toDoubleArray()[instanceValues.length-1]);
                    break;
                case 2:
                    risk[2].add(data.instance(i).toDoubleArray()[instanceValues.length-2],data.instance(i).toDoubleArray()[instanceValues.length-1]);
                    break;
            }

            i++;
        }


        drawScatterPlot();
        return totalRisk;
    }

    private XYDataset createDataset() {
        XYSeriesCollection result = new XYSeriesCollection();
        /*XYSeries series = new XYSeries("Hello");
        series.add(1.0,5.740000009536743);
        series.add(3.0,3.0);
        XYSeries ser_ies = new XYSeries("Bye");
        ser_ies.add(2.0,2.0);
        ser_ies.add(10.0,10.0);
        result.addSeries(series);
        result.addSeries(ser_ies);*/
        result.addSeries(loginAtt);
        result.addSeries(risk[0]);
        result.addSeries(risk[1]);
        result.addSeries(risk[2]);
        return result;
    }

    private void drawScatterPlot(){

        // create a chart...
        JFreeChart chart = ChartFactory.createScatterPlot(
                "Scatter Plot", // chart title
                "KeyStroke Dynamics (char/s)", // x axis label
                "Session Time (sec)", // y axis label
                createDataset(), // data
                PlotOrientation.VERTICAL,
                true, // include legend
                true, // tooltips
                false // urls
        );

       /* XYPlot xyPlot = (XYPlot) chart.getPlot();
        xyPlot.setDomainCrosshairVisible(true);
        xyPlot.setRangeCrosshairVisible(true);
        XYItemRenderer renderer = xyPlot.getRenderer();
        renderer.setSeriesPaint(0, Color.blue);
        NumberAxis domain = (NumberAxis) xyPlot.getDomainAxis();
        domain.setRange(0.00, 10.00);
        domain.setTickUnit(new NumberTickUnit(0.5));
        domain.setVerticalTickLabels(true);
        NumberAxis range = (NumberAxis) xyPlot.getRangeAxis();
        range.setRange(0.0, 10.0);
        range.setTickUnit(new NumberTickUnit(0.5));*/




        // create and display a frame...
        ChartFrame frame = new ChartFrame("", chart);
        frame.pack();
        frame.setVisible(true);

    }

}
