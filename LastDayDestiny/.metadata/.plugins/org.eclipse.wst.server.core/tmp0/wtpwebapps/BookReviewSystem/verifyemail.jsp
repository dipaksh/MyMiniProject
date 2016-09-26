<%@ page language="java" contentType="text/plain; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>


<% String email=request.getParameter("val"); %>

<%
	try
	{  
		int count=0;
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookreviewsystem","root","root");  
 		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from user where useremailid='"+email+"'");  
		while(rs.next())
		{
			count=rs.getInt(1);
		}
		if(count!=0)
		{
		
			out.println("User already exists");
		}
	
		con.close();  
	}
	catch(Exception e)
	{ 
		System.out.println(e);
	}  
  
%>