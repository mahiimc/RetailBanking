package com.retailbanking.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseUtil {
	private static String UNAME="system";	
	final private static String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static String PASSWORD="maheshchary";
	final private static String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	public static Connection con =null;
	public static Connection openConnection() {
		try {

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
 * class Test { public static void main(String[] args) {
 * System.out.println(DataBaseUtil.openConnection().getClass());
 * 
 * } }
 */

