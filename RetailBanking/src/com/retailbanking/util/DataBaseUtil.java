package com.retailbanking.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataBaseUtil {
	private static String UNAME;
	final private static String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static String PASSWORD;
	final private static String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	public static Connection con =null;
	public static Connection openConnection() {
		try {
			try(FileReader reader = new FileReader("db_details.properties")) {
				Properties prop = new Properties();
				prop.load(reader);
				UNAME = prop.getProperty("user");
				PASSWORD =prop.getProperty("password");
			}
			catch(FileNotFoundException  e ) {
			e.printStackTrace();
			}
			Class.forName(DRIVER_NAME);
			con=DriverManager.getConnection(URL,UNAME,PASSWORD);
			//System.out.println("Connected");
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		return con;
		
	}
	public void closeConnection(Connection con) {
		if(con != null) {
			try {
				con.close();
			}
			catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}
	
}

/*
 * Manual Testing
 * class Test { public static void main(String[] args) {
 * System.out.println(DataBaseUtil.openConnection().getClass());
 * 
 * } }
 */
