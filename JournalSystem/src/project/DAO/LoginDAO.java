package project.DAO;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.Properties;
import com.mysql.cj.xdevapi.PreparableStatement;

import project.helper.*;
import project.GUI.*;

public class LoginDAO {
	
	private static Connection myConn;
	
	//Build the constructor
	public LoginDAO() throws Exception{
		
		// get database properties
		Properties props = new Properties();
		props.load(new FileInputStream("database.properties"));
		
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");
		// connect to database
		myConn = DriverManager.getConnection(dburl, user, password);
		// if connected, it will print in terminal
		System.out.println("DB connection suceesful to: " + dburl);
		
		
		
	}
	
	private static void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException{
		
		if(myRs != null) {
			myRs.close();
		}
		
		if(myStmt != null) {
			
		}
		
		if(myConn != null) {
			myConn.close();
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO
		PreparedStatement myStmt = null;
		ResultSet rs = null;
		String input_username = null;
		LoginDAO loginDAO = new LoginDAO();
		try {
			LoginWindow window = new LoginWindow();
			window.open();
			//input_username = window.getUsername();
			
			
			try {
				myStmt = myConn.prepareStatement("select password from users where username=? ");
				myStmt.setString(1, input_username);
				rs = myStmt.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnsNumber = rsmd.getColumnCount();
				//this is for printing the result set(there will be only one value)
				   if (rs.next()) {
				       for (int i = 1; i <= columnsNumber; i++) {
				           if (i > 1) System.out.print(",  ");
				           String columnValue = rs.getString(i);
				           System.out.print(columnValue);
				       }
				       System.out.println("");
				   	}else {
				   		System.out.println("Sorry, your username is not registered");
				   	}
				   
			}
					
			finally {
				close(null, myStmt, rs);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
	
}
