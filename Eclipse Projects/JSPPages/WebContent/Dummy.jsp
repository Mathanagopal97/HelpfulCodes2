<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Echoing HTML Request Parameters</title>
</head>
<body>
	<h3>Choose an author:</h3>
	<form method="post">
		<input type="checkbox" name="author" value="Tan Ah Teck">Tan <input
			type="checkbox" name="author" value="Mohd Ali">Mohd Ali <input
			type="checkbox" name="author" value="Kumar">Kumar <input
			type="submit" value="Query">
	</form>

	<%
		String[] authors = request.getParameterValues("author");
		out.println("This is inserted using out.println()");
		if (authors != null) {
	%>
	<%
		if (authors.length == 1) {
	%>
	<h3>You have selected the author:</h3>

	<%
		} else {
	%>
	<h3>You have selected the following authors:</h3>
	<ul>
		<%
			}
				for (int i = 0; i < authors.length; ++i) {
		%>
		<li><%=authors[i]%></li>
		<%
			}
		%>
	</ul>
	<a href="<%=request.getRequestURI()%>">BACK</a>
	<%
		}
	%>
</body>
</html>