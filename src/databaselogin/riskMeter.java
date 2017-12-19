package databaselogin;

import eu.hansolo.steelseries.gauges.Linear;
import eu.hansolo.steelseries.gauges.Radial;
import eu.hansolo.steelseries.gauges.Radial1Square;
import eu.hansolo.steelseries.tools.BackgroundColor;
import eu.hansolo.steelseries.tools.ColorDef;
import eu.hansolo.steelseries.tools.FrameDesign;

import java.awt.*;
import javax.swing.*;


public class riskMeter {
    static Radial gauge=new Radial();
    public static void createAndShowUI() {

        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setLocation(895,215);
        JPanel panel = new JPanel()
        {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(300, 300);
            }
        };
        panel.setBackground(new java.awt.Color(0, 0, 0));


        gauge.setTitle("Risk Meter");
        gauge.setUnitString("");

        panel.setLayout(new BorderLayout());
        panel.add(gauge, BorderLayout.CENTER);
        frame.add(panel);

      //  gauge.setSection3DEffectVisible(true);
        gauge.setBackgroundColor(BackgroundColor.BRUSHED_METAL);
        gauge.setFrameDesign(FrameDesign.BLACK_METAL);

            gauge.setPointerColor(ColorDef.GREEN);
            gauge.setValueAnimated(0);

        frame.pack();
        frame.setVisible(true);
    }

    public void update(double risk){
        if(risk == 1){
            gauge.setPointerColor(ColorDef.GREEN);
            gauge.setValueAnimated(0);
        }
        else if(risk==2){
            gauge.setPointerColor(ColorDef.ORANGE);
            gauge.setValueAnimated(50);

        }
        else{
            gauge.setPointerColor(ColorDef.RED);
            gauge.setValueAnimated(100);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowUI();
            }
        });
    }
}