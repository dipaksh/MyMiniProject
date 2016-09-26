package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin {
	
	 String adminemail;
	 String adminpass;
	 Connection con=Connect.getConnection();
	 Statement stmt=Connect.getStatement();
	 ResultSet rs=null;
	 int userid=0;
	
	//Function to verify authetication of admin
	public  boolean verifyAdmin(String email,String password)
	{
		
		
		boolean status=false;  
		try
		{
			PreparedStatement p = con.prepareStatement("select * from admintable where aemail=? and apass=?");
			p.setString(1,email);  
			p.setString(2,password);
			ResultSet rs=p.executeQuery();  
			status=rs.next();  
			
			return status;
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	//Function to get admin name
	public  String getAdminName(String email) {
		String name ="";
	
		try {
			
			PreparedStatement p = con.prepareStatement("select * from admintable where aemail=?");
			p.setString(1,email);
			ResultSet rs=p.executeQuery();
			if(rs.next())
			name= rs.getString(2);
			return name;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;  
		
	}
}
