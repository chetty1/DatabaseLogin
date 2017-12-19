package databaselogin;

import java.sql.*;

/**
 * Created by oracle on 5/4/2016.
 */
public class RegDb {
    Statement stmt;
    Connection con;


    public  RegDb() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//step2 create  the connection object
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Registration","SIVESH","chetty951753");

//step3 create the statement object

    }

    public void updateClientInfo(Client client,int id)throws SQLException{
        stmt = con.createStatement();

        stmt.executeUpdate("INSERT INTO CLIENT_INFORMATION VALUES ('"+id+"','"+client.getUsername()+"','"+Double.parseDouble(client.getID())+"','"+client.getSurname()+"','"+client.getDay()+"-"+client.getMonth().toUpperCase()+"-"+client.getYear()+"','"+client.getAddress1()+"','"+client.getEmail()+"','"+Double.parseDouble(client.getCell())+"','04-MARCH=2016','"+client.getName()+"','"+client.getPassword()+"','"+client.getNokEmail()+"','"+client.getNokName()+"','"+client.getNokSurname()+"','"+client.getSurephrase()+"')");
    }

    public String getSurephrase(String username)throws SQLException{
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM CLIENT_INFORMATION WHERE USERNAME = '"+username+"'");


        String sp="";
        while( rs.next()) {
            sp  = rs.getString("SUREPHRASE");
        }

        return sp;
    }

    public void updateClientRisk(Client client,int id)throws SQLException{
        stmt=con.createStatement();

        stmt.executeUpdate("INSERT INTO RISK_BASED_A VALUES ('"+id+"','"+client.getIp()+"','"+client.getMac()+"','"+client.getKeyPressed()+"','"+"0"+"','"+client.getSessionDuration()+"')");

    }


    public boolean getDetails(String username,String Pass)throws SQLException{
        String user=null;
        String pass=null;
        stmt= con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT USERNAME FROM CLIENT_INFORMATION WHERE USERNAME='"+username+"'");
        while(rs.next()) {
            user = rs.getString("USERNAME");

        }
        System.out.print("");
        rs= stmt.executeQuery("SELECT PASSWORD FROM CLIENT_INFORMATION WHERE PASSWORD='"+Pass+"'");
        while(rs.next()) {
            pass = rs.getString("PASSWORD");
        }
        if(!pass.equals(null) &&!user.equals(null)){
            return true;
        }
        else{
            return false;
        }

    }

    public int getClientID()throws SQLException{

        int meh =1;
        stmt = con.createStatement();
        ResultSet rs= stmt.executeQuery("SELECT * FROM CLIENT_INFORMATION");

        while (rs.next()){

            meh++;

        }

        return meh ;

    }

    public int returnID(String username)throws SQLException{
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT CLIENT_ID FROM CLIENT_INFORMATION WHERE USERNAME='"+username+"'");

        int id=0;

        while (rs.next()){
            id=rs.getInt("CLIENT_ID");
        }
        return id;

    }
}
