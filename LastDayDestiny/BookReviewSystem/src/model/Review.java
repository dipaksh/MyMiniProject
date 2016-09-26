package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Review 
{
	 String bookid;
	 int userid;
	 int reviewid;
	 String review;
	 Connection con=Connect.getConnection();
	 Statement stmt=Connect.getStatement();
	 String updatedreview;
	ResultSet rs=null;
	 int i=0;
	
	//Function to add review to book
	public  boolean addReview(String bid, int uid, String reviews) 
	{

		bookid = bid;
		userid = uid;
		review = reviews;
		
		if(con!=null && stmt!=null)
		{
			try 
			{
				i=stmt.executeUpdate("insert into reviewtable(userid,bookid,reviews)values('"+userid+"','"+bookid+"','"+review+"') ");
				if(i!=0)
				{
					 return true;
				}
				else
				{
					return false;
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			return false;
			
		}
		return false;
		
	}
	//Function to update review of book
	public  boolean UpdateReview(int rid, String updatedreview1) 
	{
		int i=0;
		reviewid = rid;
		updatedreview=updatedreview1;
		if(con!=null && stmt!=null)
		{
			try 
			{
				i=stmt.executeUpdate("update reviewtable set reviews='"+updatedreview+"' where reviewid='"+reviewid+"' ");
				if(i!=0)
				{
					 return true;
				}
				else
				{
					return false;
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			return false;
			
		}
		return false;
		
		
	}
	//Function to delete review of book
	public  boolean DeleteReview(int rid) 
	{
		int i=0;
		reviewid = rid;
		
		if(con!=null && stmt!=null)
		{
			try 
			{
				i=stmt.executeUpdate("delete from reviewtable where reviewid='"+reviewid+"' ");
				if(i!=0)
				{
					 return true;
				}
				else
				{
					return false;
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			return false;
			
		}
		return false;
		
		
	}
	
	
}
