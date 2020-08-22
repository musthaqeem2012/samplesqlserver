#!/usr/bin/env groovy
import java.io.*;
import java.sql.*; 
 
 Connection conn = null;
         String url = "jdbc:sqlserver://localhost:1433;databasename=Test;integratedSecurity=true";
         String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
         String userName = "DESKTOP-PLD86VN\\DELL"; 
         String password = "";
         Statement stmt;
        
        // try
        // {

         Class.forName(driver);//.newInstance();
         conn = DriverManager.getConnection(url,userName,password);
         String query = "select * from dbo.Department";
         stmt = conn.createStatement();
         flag = stmt.executeUpdate(query);
         echo "flag"
        // echo flag; 
         conn.close();
       // println("");
        // }// catch (Exception e) {
       //  e.printStackTrace();
        // }
