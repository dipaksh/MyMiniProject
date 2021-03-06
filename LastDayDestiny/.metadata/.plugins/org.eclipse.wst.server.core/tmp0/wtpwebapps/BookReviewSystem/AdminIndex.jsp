<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.sql.*" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="model.*" %>
<%ResultSet resultset =null;%>
<%ResultSet resultset1 =null;%>
<%ResultSet resultset2 =null;%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
		
		<title>Book Review System </title>
		
		<link rel="stylesheet" type="text/css" href="css/960_24_col.css" />
		<link rel="stylesheet" type="text/css" href="css/fonts.css" charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="css/prettyPhoto.css" />
		<link href="css/jquery-ui-1.9.1.date-picker.css" rel="stylesheet" type="text/css" />
		<link href="css/validationEngine.jquery.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/forms.css" />
		
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript">
			var relTag = "login";
		</script>
		<style>
		span.msg{
		color:red;
		}
		</style>
		
		<script type="text/javascript">
                    
			
		</script>
	</head>

	<body>
		<!-- HEADER START -->
		<c:if test="${empty sessionScope.userid }">
		<jsp:forward page="adminlogin.jsp" />
			</c:if>
		<div class="header">
			<div class="dark-nav">
				<div class="container_24">
					<div class="grid_12">
						<ul class="nav-alt">
							<b>AdminPage</b>
							
							
						</ul>
					</div>
					<div class="grid_12">
						<ul class="nav-alt">
							<form action="#" class="float-right" method="post">
				   				<table cellpadding="0" cellspacing="0">
									<tr>
										<td>
							     			<li><a href="logout.jsp"><B>Admin Logout</B></a></li>
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
					<div class="grid_24">
						
					</div>
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
						<h2> Book Management</h2>
					</div>
						<div class="grid_6 alpha">
							<div class="padding_20">
								<div class="accordion nav-sidebar">
									<h3>Book</h3>
										<div>
												
										
											<ul>
												
												<li><a href="AdminIndex.jsp">Add Book</a></li>
												<li><a href="RemoveBook.jsp">Remove Book </a></li>
												
												
												
											</ul>
										</div>
									
								
									<h3>Account</h3>
										<div>
											<ul>
												<li><a href="ActiveSessionCount.jsp">Check LoginUser</a></li>
											</ul>
										</div>
									
									
								</div>
							</div>
						</div>	
			
						<div class="grid_18 omega">
						 
							<div class="padding_20 text-justify">
								<form id="frmMain" action="AddBooksDetails" class="frmMain" method="get">
									<table class="form-table" style="width:auto">
									
										
										<table border='0' width='100%' class='table11'>
										<tr>
											<td>Book Name</td>
											<td><input type="text" class="validate[required]"  name="title" placeholder="Enter Book Title here"/></td>
										</tr>
										<tr>
											<td>Author</td>
											<td><input type="text" class="validate[required]"  name="author" placeholder="Enter author name"/></td>
											
										</tr>
										<tr>
											<td>Pages</td>
											<td><input type="text" class="validate[required]"  name="pages" placeholder="Number of pages"/></td>
											
										</tr>
										<tr>
											<td>Publication</td>
											<td><input type="text" class="validate[required]"  name="publication" placeholder="Enter book's publication"/></td>					
											
										</tr>
										<tr>
											<td>Edition</td>
									<td><input type="text" class="validate[required]"  name="edition" placeholder="Enter book's edition"/></td>		
										</tr>
										<tr>
											<td>Genre</td>
										<td><input type="text" class="validate[required]"  name="genre" placeholder="Enter book's genre"/></td>	
										</tr>
										<tr>
											<td>Price</td>
										<td><input type="text" class="validate[required]"  name="Price" placeholder="Enter Book's Price"/></td>	
										</tr>
										<tr>
											<td><input type="submit" value="Add"/></td>
											<td></td>
											
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
		<div class="clear"> </div>
		

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
