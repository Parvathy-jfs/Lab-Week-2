package jdbc_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Connection, statements are interfaces except Driver manager
public class JDBCSelect {
	    //Get ojjdbc14.jar
	    //Load the driver
	
		private static Connection connection;

		public static void main(String[] args) {
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver loaded successfully!");
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr", "hr");  //orcl or xe
				
				System.out.println("Connection Established!");
				//Create a statement on a connection to execute in that
				Statement statement= connection.createStatement();
				//Execute the query
				ResultSet resultSet= statement.executeQuery("Select * from Employees"); //Queries are case insensitive
				while(resultSet.next()) {
					int employeeId= resultSet.getInt("Employee_ID");
					String firstName= resultSet.getString("First_Name");
					System.out.println(employeeId+">"+firstName);
				}
				System.out.println(resultSet); //resultset interface implemented by resultset impl
			}
			catch(ClassNotFoundException e)
			{
				System.out.println(e);
			}
			catch (SQLException e) {             //SQLException is checked exception
				System.out.println(e);
			}
		}

	}



