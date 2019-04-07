/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thisi
 */
public class ConnectDB {

    //Connection
    private static Connection conn = null;
    //Statement

    private static final String cs = "jdbc:mysql://localhost:3306/nhahang?characterEncoding=UTF-8&autoReconnect=true&useSSL=false";
    private static final String user = "root";
    private static final String password ="231996";

    //private String table = "monan";

    //Ham ket noi database
    public static Connection openConnect() {        
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Load Driver
            conn = DriverManager.getConnection(cs, user, password); //Lay connection
            System.out.println("Success");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found");
        } catch (SQLException ex) {
            System.out.println("Error connection");
        }
        return conn;
    }
    

    public static void closeConnection() throws SQLException {
       conn.close();
    }
    
}