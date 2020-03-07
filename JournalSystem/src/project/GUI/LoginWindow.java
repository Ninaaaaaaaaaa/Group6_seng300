package project.GUI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.Properties;
import com.mysql.cj.xdevapi.PreparableStatement;

public class LoginWindow {

	protected Shell shell;
	private Text txtUsername;
	private Text txtPassword;
	private String username;
	private String password;

	/**
	 * Launch the application.
	 * @param args
	 */

	public static void main(String[] args) {
		try {
			LoginWindow window = new LoginWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(173, 216, 230));
		shell.setSize(400, 300);
		shell.setText("Login Window");
		
		txtUsername = new Text(shell, SWT.BORDER);
		txtUsername.setBounds(128, 87, 150, 19);
		
		txtPassword = new Text(shell, SWT.BORDER);
		txtPassword.setBounds(128, 146, 150, 19);
		
		Label lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setBounds(46, 87, 59, 14);
		lblUsername.setText("username");
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setText("password");
		lblPassword.setBounds(46, 146, 59, 14);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				username = txtUsername.getText();
				password = txtPassword.getText();
				System.out.println("input username is: " + username + " input password is: " + password);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////
				//now is the database part
				
				Connection myConn = null;
				// get database properties
				Properties props = new Properties();
				try {
					props.load(new FileInputStream("database.properties"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				String dbuser = props.getProperty("user");
				String dbpassword = props.getProperty("password");
				String dburl = props.getProperty("dburl");
				PreparedStatement myStmt = null;
				ResultSet rs = null;
				String input_username = username;
				
				// connect to database
				try {
					myConn = DriverManager.getConnection(dburl, dbuser, dbpassword);
				
				// if connected, it will print in terminal
				System.out.println("DB connection suceesful to: " + dburl);
				
				
					myStmt = myConn.prepareStatement("select password from users where username=? ");
					myStmt.setString(1, input_username);
					rs = myStmt.executeQuery();
					String columnValue = null;
					
					
					ResultSetMetaData rsmd = rs.getMetaData();
					int columnsNumber = rsmd.getColumnCount();
					
					//this is for printing the result set(there will be only one value)
					   if (rs.next()) {
					       for (int i = 1; i <= columnsNumber; i++) {
					           if (i > 1) System.out.print(",  ");
					           columnValue = rs.getString(i);
					           System.out.print(columnValue);
					           
					       }
					       if(columnValue.equals(password)) {
					    	   System.out.println("Yes the password is correct");
					    	   //TO DO
					    	   //need to switch to admin/editor/reviewer/
					       }
					       else {
					    	   System.out.println("Sorry the password is not correct");
					    	  
					    	   
					       }
					       System.out.println("");
					   	}else {
					   		
					   		System.out.println("Not in the database");
					   	}
				}
				catch(SQLException e1) {
					e1.printStackTrace();
				}
				
	
			}
		});
		btnNewButton.setBounds(238, 199, 94, 27);
		btnNewButton.setText("Login");

	}
}
