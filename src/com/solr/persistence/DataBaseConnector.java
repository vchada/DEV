package com.solr.persistence;
import java.sql.*;
public class DataBaseConnector 
{
	public void connector()
	{
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/venkata","root","root");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from users");  
			while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}
	public static void main(String[] args) 
	{
		DataBaseConnector dbc = new DataBaseConnector();
		dbc.connector();
	}
}
