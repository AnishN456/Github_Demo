package io.paycorp.account_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","root");
			System.out.println("Connection is Established...");
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
