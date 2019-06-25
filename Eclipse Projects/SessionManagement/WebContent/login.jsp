<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if (session.getAttribute("name") != null) {
		response.sendRedirect("AfterLogin.jsp");
%>

<%
	} else {
%><form action="LoginServlet" method="post">
	<input type="text" name="username"> <input type="password"
		name="password"> <input type="submit" value="login">
</form>
<%
	}
%>
</body>
</html>