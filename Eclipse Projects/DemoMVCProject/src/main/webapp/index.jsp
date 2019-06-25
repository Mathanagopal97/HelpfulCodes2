<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
%>
<%
	if (session.getAttribute("name") != null) {
		String nameofUser = session.getAttribute("name").toString();
%>
<title>Welcome <%
	out.println(nameofUser);
%></title>
<%
	} else {
%>
<title>Welcome to our home page</title>
<%
	}
%>
</head>
<body>
	<%
		if (session.getAttribute("name") != null) {
			String nameofUser = session.getAttribute("name").toString();
	%>
	<a href="LogoutServlet">Click here to logout</a>
	<h1>
		Welcome to our page
		<%
		out.println(nameofUser);
	%>
		Explore the page.
	</h1>

	<%
		} else {
	%>
	<h1>Welcome to our page user. Explore the page.</h1>
	<a href="login.jsp">Click here to login</a>
	<%
		}
	%>

</body>
</html>