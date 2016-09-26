package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User 
{
	 String username;
	 String useremail;
	 String userpassword;
	 String userquestion;
	 String useranswer;
	 Connection con=Connect.getConnection();
	 Statement stmt=Connect.getStatement();
	 ResultSet rs=null;
	 ResultSet rs1=null;
	 int userid=0;
	
	//Function for user registration
	public  boolean registerUser(String username1, String useremail1, String userpassword1,
			String userquestion1, String useranswer1) throws SQLException 
	{
		int i=0;
		username = username1;
		useremail = useremail1;
		//userpassword = userpassword1;
		userquestion = userquestion1;
		useranswer = useranswer1;
		userpassword=EncriptUtils.EncryptPassword(useremail1, userpassword1);

		
		if(con!=null && stmt!=null)
		{
			i=stmt.executeUpdate("insert into user(username,useremailid,userpassword,usersecurityquestion,usersecurityanswer)values('"+username+"','"+useremail+"','"+userpassword+"','"+userquestion+"','"+useranswer+"') ");
			if(i!=0)
			{
				 return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
			
		}
	
	}
	//Function to validate user information for login
	public  int verifyUser(String email,String password)
	{
		
		try
		{
			password=EncriptUtils.EncryptPassword(email, password);

			rs= stmt.executeQuery("select * from user where useremailid='"+email+"' and userpassword='"+password+"'");
			while(rs.next())
			{
				userid= rs.getInt(1);
				
			}
			if(userid!=0)
			{
				return userid;
			}
			else
			{
				return 0;
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}
	//Function to reset password if user forget his password
	public  int resetUserPassword(String email,String question,String answer)
	{
		int i=0;	
		try
		{
			rs= stmt.executeQuery("select * from user where useremailid='"+email+"' and usersecurityquestion='"+question+"' and usersecurityanswer='"+answer+"'");
			while(rs.next())
			{
				i= rs.getInt(1);
				
			}
			if(i!=0)
			{
				return i;
			}
			else
			{
				return 0;
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}
	//Function to set the users new password
	public  boolean setUserPassword(int userid,String password)
	{
		int i=0;
		String email="null";
		try
		{
			
			rs1= stmt.executeQuery("select * from user where userid='"+userid+"' ");
			while(rs1.next())
			{
				email= rs1.getString(3);
				
			}
			password=EncriptUtils.EncryptPassword(email, password);
			//rs= stmt.executeQuery("select * from user where useremailid='"+email+"' and usersecurityquestion='"+question+"' and usersecurityanswer='"+answer+"'");
			
			i=stmt.executeUpdate("update user set userpassword='"+password+"' where userid='"+userid+"' ");

			if(i!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	//function to change password if user know the old password.
	public  boolean verifyOldPassword(int userid,String oldpassword)
	{
		int i=0;	
		String email="null";
		try
		{
			rs1= stmt.executeQuery("select * from user where userid='"+userid+"' ");
			while(rs1.next())
			{
				email= rs1.getString(3);
				
			}
			oldpassword=EncriptUtils.EncryptPassword(email, oldpassword);
			rs= stmt.executeQuery("select * from user where userid='"+userid+"' and userpassword='"+oldpassword+"'");
			while(rs.next())
			{
				i= rs.getInt(1);
				
			}
			if(i!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
			
	}

}
