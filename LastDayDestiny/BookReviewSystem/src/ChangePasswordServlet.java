//Servlet for: if user is logged in successfully using his/her credential and he want
//to change the password.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String oldpassword=request.getParameter("oldpassword");
		String newpassword=request.getParameter("newpassword");
		String confirmpassword=request.getParameter("confirmpassword");
		HttpSession session=request.getSession(false);  
	    int userid=(Integer)session.getAttribute("userid");
	    User u=new User();
	    if(u.verifyOldPassword(userid,oldpassword))
	    {
	    	if(u.setUserPassword(userid, newpassword))
	    	{
	    		RequestDispatcher rd=request.getRequestDispatcher("/userlogin.jsp");  
				out.println("<script type='text/javascript'>alert('Password Changed Successfully. Please login again.')</script>");
				rd.include(request, response); 
	    		
	    	}
	    	else
	    	{
	    		RequestDispatcher rd=request.getRequestDispatcher("/changeuserpassword.jsp");  
				out.println("<script type='text/javascript'>alert('Fail to Change the password. Please try again.')</script>");
				rd.include(request, response); 
	    	}
	    	
	    	
	    }
	    else
	    {
	    	RequestDispatcher rd=request.getRequestDispatcher("/changeuserpassword.jsp");  
			out.println("<script type='text/javascript'>alert('Incorrect Old Password. Please try again.')</script>");
			rd.include(request, response); 
	    	
	    }
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
