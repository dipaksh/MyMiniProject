<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Review System</title>
</head>
<body>
<c:if test="${empty sessionScope.userid }">
		<jsp:forward page="userlogin.jsp" />
	</c:if>
	<% request.getSession().setAttribute("userid", null); //it just assigns null to attribute
		request.getSession().removeAttribute("userid");	
	session.removeAttribute("userid");
	session.invalidate();
	request.getSession().invalidate();
 	response.sendRedirect("index.jsp");%>

</body>
</html>