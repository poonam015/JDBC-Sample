package com.jdbcSample;

//importing package
import java.sql.*;

/**
 * JDBC SAMPLE PROGRAM BY #poonamshinde
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {

    	//load and register driver
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	//create the object to get Connection
    	//url to db,username,password
    	String url="jdbc:mysql://localhost:3306/Sample";
    	String username="root";
    	String password="Poonu@15";
    	
    	//get connection to the db
    	Connection ps=DriverManager.getConnection(url,username,password);
    	//a statement to execute a query
    	Statement st=ps.createStatement();
    	//execution of query and storing the response in resultset rs
    	ResultSet rs=st.executeQuery("select * from mobile");
    	//checking for reponse
    	System.out.println("Mobileid\tMobileName\tMobilePrice\n");
    	while(rs.next())
    	{
    		String Mobiledata=rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3);
    		
    		System.out.println(Mobiledata);
    	//reading the mobile name from response

    	//printing mobile name
    	}
    	//closing the connection
    	
    	ps.close();
    }
}