package com.jdbcSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class addusermobile {

	public static void main( String[] args ) throws Exception
    {
		//TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
    	//load and register driver
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	//create the object to get Connection
    	//url to db,username,password
    	String url="jdbc:mysql://localhost:3306/Sample";
    	String username="root";
    	String password="Poonu@15";
    	Connection ps=DriverManager.getConnection(url,username,password);
    	
    	System.out.println("******************Add Your Mobile to DB******************");
    	System.out.println("Enter Mobile Id");
    	int mid=scan.nextInt();
    	System.out.println("Enter Mobile Name");
    	scan.nextLine();
    	String mname=scan.nextLine();
    	System.out.println("Enter Mobile Price");
    	int mprice=scan.nextInt();
    	
    	String query="insert into mobile values(?,?,?)";
    	
    	PreparedStatement pst=ps.prepareStatement(query);
    	pst.setInt(1, mid);
    	pst.setString(2, mname);
    	pst.setInt(3, mprice);
    	
    	int count=pst.executeUpdate();
    	System.out.println(count+" row(s) effected");
    	ps.close();
    	scan.close();
    }	
	
}
