<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.ResultSetMetaData"%>

<html>
<head><title>First JSP</title></head>
<body>
<%
    int success = 0;
    try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Get a connection
           Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Project","root","root"); 
           Statement stmt = conn.createStatement();
           success++;
           
        }
         
        
    catch (Exception except)
        {
            except.printStackTrace();
        }    
    if (success == 1) 
    {
%>
        <h2>Connected</h2>
<%
    }
    else
    {
%>
        <h2>Not Connected</h2>
<%
    }
%>
</body>
</html>
