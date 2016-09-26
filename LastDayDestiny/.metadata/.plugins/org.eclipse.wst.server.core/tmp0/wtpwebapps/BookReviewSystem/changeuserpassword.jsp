<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="model.*"%>
<%ResultSet resultset =null;%>
<%ResultSet resultset1 =null;%>
<%ResultSet resultset2 =null;%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />

<title>Book Review System</title>

<link rel="stylesheet" type="text/css" href="css/960_24_col.css" />
<link rel="stylesheet" type="text/css" href="css/fonts.css"
	charset="utf-8" />
<link rel="stylesheet" type="text/css" href="css/prettyPhoto.css" />
<link href="css/jquery-ui-1.9.1.date-picker.css" rel="stylesheet"
	type="text/css" />
<link href="css/validationEngine.jquery.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/forms.css" />

<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
			var relTag = "login";
		</script>
<style>
span.msg {
	color: red;
}
</style>

<script type="text/javascript">
		 function validateCPassword()
		 {
			 var cpass = document.getElementById("newpassword").value;
			 var pass = document.getElementById("confirmpassword").value;
			
				if(cpass!=pass)
				{
					 document.getElementById("errcpass").style.color = "red";
					document.getElementById("errcpass").innerHTML = "Password does not match";
					document.getElementById("newpassword").value = "";
					document.getElementById("confirmpassword").value = "";
				}
				else
					{
					document.getElementById("errcpass").innerHTML = "";
					
					}
		 }
		 function validatePassword()
		 {
			 var pass = document.getElementById("newpassword").value;
			 document.getElementById("errpass").style.color = "red";
			
				if(pass.length<5)
				{
					
					document.getElementById("errpass").innerHTML = "Please atleast 5 digits";
					
					document.getElementById("newpassword").value = "";
					
				}
				
				else if(pass.length>15)
				{
					
					document.getElementById("errpass").innerHTML = "Please atmost 14 digits";
					document.getElementById("newpassword").value = "";
				}
				else
					{
					document.getElementById("errpass").innerHTML = "";
					}
		 }
		 
		 
                    
			
		</script>
</head>

<body>
	<!-- HEADER START -->
	<c:if test="${empty sessionScope.userid }">
		<jsp:forward page="userlogin.jsp" />
	</c:if>
	<div class="header">
		<div class="dark-nav">
			<div class="container_24">
				<div class="grid_12">
					<ul class="nav-alt">
						<%  int id=(Integer)session.getAttribute("userid");
								String username;
						
								%>
						<%	
							try{  
								
				  
								Connection con=Connect.getConnection();
								Statement stmt=Connect.getStatement();
								ResultSet rs=stmt.executeQuery("select * from user where userid='"+id+"'");  
				  
								while(rs.next())
								{
									username =rs.getString(2);
									%>
						<b> Welcome:<% out.println(username); %>
						</b>
						<%
								
								}
				
				  		
				  
					}catch(Exception e){ System.out.println(e);}  
				  
			
 						%>


					</ul>
				</div>
				<div class="grid_12">
					<ul class="nav-alt">
						<form action="#" class="float-right" method="post">
							<table cellpadding="0" cellspacing="0">
								<tr>
									<td>
										<li><a href="logout.jsp"><B>User Logout</B></a></li>
									</td>

								</tr>
							</table>
						</form>
					</ul>

				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="container_24">
			<div class="grid_4">
				<img alt="logo" src="images/bookreview.png" class="img-logo" />
			</div>
			<div class="grid_20">
				<h1 class="title">Book Review System</h1>
			</div>
			<div class="clear"></div>
		</div>

		<div class="nav-main-container">
			<div class="container_24">
				<div class="grid_24"></div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<!-- HEADER END -->


	<!-- CONTENTS START -->
	<div class="container_24">
		<div class="grid_24">
			<div class="contents">
				<div class="padding_20">
					<h2>All Book</h2>
				</div>
				<div class="grid_6 alpha">
					<div class="padding_20">
						<div class="accordion nav-sidebar">
							<h3>Book</h3>
							<div>


								<ul>
									<li><a href="UserIndex.jsp">All Books</a></li>
									<li><a href="searchbook.jsp">Search </a></li>


								</ul>
							</div>


							<h3>Account</h3>
							<div>
								<ul>

									<li><a href="changeuserpassword.jsp">Change Password</a></li>

								</ul>
							</div>


						</div>
					</div>
				</div>

				<div class="grid_18 omega">

					<div class="padding_20 text-justify">
						<form id="frmMain" action="ChangePasswordServlet" class="frmMain"
							method="post">
							<table class="form-table" style="width: auto">


								<table border='0' width='100%' class='table11'>
									<%  int userid=(Integer)session.getAttribute("userid");%>

									<tr>
										<th colspan="2">Change Password</th>

									</tr>
									<tr>
										<td>Old Password</td>
										<td><input id="oldpassword" type="password"
											class="validate[required]" name="oldpassword"
											style="width: 50%" placeholder="old password" value="" /></td>

									</tr>
									<tr>
										<td>New Password</td>
										<td><input id="newpassword" type="password"
											class="validate[required]" name="newpassword"
											style="width: 50%" placeholder="new password" value=""
											onChange="validatePassword()" /> <span id="errpass"></span>
										</td>

									</tr>
									<tr>
										<td>Confirm Password</td>
										<td><input id="confirmpassword" type="password"
											class="validate[required]" name="confirmpassword"
											style="width: 50%" placeholder="confirm password" value=""
											onChange="validateCPassword()" /> <span id="errcpass" /></td>

									</tr>
									<tr>
										<th>&nbsp;</th>
										<td><input id="Submit1" type="submit" value="submit" />
											<input id="Reset1" type="reset" value="Reset"
											onclick="this.form.clear();" /></td>
									</tr>


								</table>



							</table>
						</form>

					</div>
				</div>

				<div class="clear"></div>
			</div>
		</div>
	</div>
	<div class="clear"></div>


	<!-- CONTENTS END -->





	<!-- FOOTER START -->
	<div class="dark-nav footer">
		<div class="container_24">
			<div class="grid_8">
				<ul class="nav-alt">
					<li><a href="index.jsp">Home</a></li>

					<li><a href="help.html">Help</a></li>
				</ul>
			</div>
			<div class="grid_8">
				<div class="text-center">Copyright &copy; All Rights Reserved</div>
			</div>
			<div class="grid_8">
				<div class="text-right">Designed &amp; Developed by Dipak</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<!-- FOOTER START -->


</body>
<script src="js/jquery-ui-1.9.2.custom.min.js" type="text/javascript"></script>
<script src="js/jquery.validationEngine.js" type="text/javascript"></script>
<script src="js/jquery.validationEngine-en.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jquery.bxslider.min.js"></script>
<script type="text/javascript" src="js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="js/custom.js"></script>

</html>
