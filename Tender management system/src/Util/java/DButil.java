package Util.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {

	
public static Connection	provideConnection() {
	Connection conn=null;
	try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	String url="jdbc:mysql://localhost:3306/TenderManagementSystem";
	 try {
		 conn =DriverManager.getConnection(url,"root","root");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	
	
	
	return conn;
}
}