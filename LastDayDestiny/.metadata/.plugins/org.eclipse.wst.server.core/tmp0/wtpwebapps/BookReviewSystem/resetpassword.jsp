
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />

<title>Book Review System</title>
<link rel="stylesheet" type="text/css" href="css/960_24_col.css" />
<link rel="stylesheet" type="text/css" href="css/fonts.css"
	charset="utf-8" />
<link href="css/validationEngine.jquery.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/forms.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script src="js/jquery-ui-1.9.2.custom.min.js" type="text/javascript"></script>
<script src="js/jquery.validationEngine.js" type="text/javascript"></script>
<script src="js/jquery.validationEngine-en.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jquery.bxslider.min.js"></script>
<script type="text/javascript" src="js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="js/custom.js"></script>
<script type="text/javascript">
		var relTag = "home";
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
						<li><a href=""><b></b></a>
					</ul>
				</div>
				<div class="grid_12"></div>
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
					<ul id="topmenunav" class="nav-main">
						<li><a rel="home" href=""index.jsp"">Home</a></li>
						<li><a rel="citizen" href="registration.jsp">Registration</a></li>
						<li><a rel="help" href="help.html">Help</a></li>
					</ul>
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

				<div class="grid_18 omega">
					&nbsp;&nbsp;
					<h2>Reset Password</h2>
					<div class="padding_20 text-justify">
						<form id="frmMain" class="frmMain" action="SetPasswordServlet"
							method="post">
							<table class="form-table" style="width: auto">
								<%  int userid=(Integer)session.getAttribute("userid");%>
								<tr>
									<th>New Password</th>
									<td><input id="password" type="password"
										class="validate[required]" name="password" style="width: 120%"
										placeholder="New password" value="" " /></td>

								</tr>

								<tr>
									<th>Confirm Password</th>
									<td><input id="cpassword" type="password"
										class="validate[required]" name="cpassword"
										style="width: 120%" placeholder="Confirm password" value="" />
									</td>

								</tr>
								<tr>
									<th>&nbsp;</th>
									<td><input id="Submit1" type="submit" value="submit" />
										<input id="Reset1" type="reset" value="Reset"
										onclick="this.form.clear();" /></td>
								</tr>
							</table>
						</form>
					</div>
				</div>

				<div class="clear"></div>
			</div>
		</div>
	</div>

	<div class="clear"></div>
	<div class="padding_20 text-justify"></div>

	</div>
	</div>
	<!-- CONTENTS END -->



	<!-- FOOTER START -->
	<div class="dark-nav footer">
		<div class="container_24">
			<div class="grid_8">
				<ul class="nav-alt">
					<li><a href=""index.jsp"">Home</a></li>
					<li><a href="#">Help</a></li>
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

</html>