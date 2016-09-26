//Servlet to set the user password.

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
 * Servlet implementation class SetPasswordServlet
 */
@WebServlet("/SetPasswordServlet")
public class SetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetPasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String password=request.getParameter("password");
		HttpSession session=request.getSession(false);  
	    int userid=(Integer)session.getAttribute("userid");
	    User u=new User();
	    
	    if(u.setUserPassword(userid, password))
		{
						       
		       RequestDispatcher rd=request.getRequestDispatcher("/userlogin.jsp");  
		       out.println("<script type='text/javascript'>alert('Password changed successfully.please do login.')</script>");
		       rd.include(request, response);	
		}
		else
		{
			 	RequestDispatcher rd=request.getRequestDispatcher("/forgetpassword.jsp");  
				out.println("<script type='text/javascript'>alert('Fail to reset password')</script>");
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
