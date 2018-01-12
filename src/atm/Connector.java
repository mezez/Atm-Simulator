/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mezez
 */
public class Connector {
    
    final static String SERVER_URL = "jdbc:mysql://127.0.0.1:3306/atm";
    final static String DB_DRIVER = "com.mysql.jdbc.Driver";
    final static String USERNAME = "root";
    final static String PASSWORD = "";
    public static Connection Connect(){
        try{
            
             // Load the JDBC driver
		 Class.forName("com.mysql.jdbc.Driver");
                 
              // Connect to a database
		     Connection connection =
		 (Connection) DriverManager.getConnection(SERVER_URL, USERNAME, PASSWORD);
                 //JOptionPane.showMessageDialog(null, "Connected Successfully");
		 return connection;
                 
        }
        catch (ClassNotFoundException ex) {
			//ex.printStackTrace();
			//String msg = "OOPs, I cannot find the Driver to load. Check if it's in your ClassPATH";
                        JOptionPane.showMessageDialog(null, ex);
		} 
		catch (SQLException e) {
			//e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                   
		} 
         return null;
    }
    
}
