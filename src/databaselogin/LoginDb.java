package databaselogin;

import java.sql.*;

/**
 * Created by oracle on 5/4/2016.
 */
public class LoginDb {
    Statement stmt;
    Connection con;
    int id =0;

    public  LoginDb() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//step2 create  the connection object
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Login","SIVESH","chetty951753");

//step3 create the statement object

    }

    public void updateClientInfo(Client client)throws SQLException{
        stmt = con.createStatement();
        id =getClientID();
        stmt.executeUpdate("INSERT INTO CLIENT_INFORMATION VALUES ('"+id+"','"+client.getUsername()+"','"+Double.parseDouble(client.getID())+"','"+client.getSurname()+"','"+client.getDay()+"-"+client.getMonth().toUpperCase()+"-"+client.getYear()+"','"+client.getAddress1()+"','"+client.getEmail()+"','"+Double.parseDouble(client.getCell())+"','04-MARCH=2016','"+client.getName()+"','"+client.getPassword()+"','"+client.getNokEmail()+"','"+client.getNokName()+"','"+client.getNokSurname()+"')");
    }

    public void updateClientRisk(Client client,int id1,int count,int id2)throws SQLException{
        stmt=con.createStatement();

        stmt.executeUpdate("INSERT INTO RISK_BASED_A VALUES ('"+id2+"','"+client.getIp()+"','"+client.getMac()+"','"+client.getKeyPressed()+"','"+count+"','"+client.getSessionDuration()+"','"+id1+"')");

    }

    public boolean getDetails(String username,String Pass)throws SQLException{

        stmt= con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT USERNAME FROM CLIENT_INFORMATION WHERE USERNAME='"+username+"'");
        rs.next();
        String user = rs.getString("USERNAME");

        rs= stmt.executeQuery("SELECT PASSWORD FROM CLIENT_INFORMATION WHERE PASSWORD='"+Pass+"'");
        rs.next();
        String pass = rs.getString("PASSWORD");

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
        ResultSet rs= stmt.executeQuery("SELECT * FROM RISK_BASED_A");

        while (rs.next()){

            meh++;

        }

        return meh ;

    }
}
