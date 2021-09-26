package Aireline_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connect {
    Connection c;
    Statement s; 

    public connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql///Airline_Management","root","");
            s=c.createStatement();


        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        new connect();
    }
}
