package com.mathan.sankar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String username = "mathan";
	private String password = "mathan123";
	public LoginServlet() {
		// TODO Auto-generated constructor stub
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		if(name.equals(username)&&pass.equals(password))
		{
			HttpSession session=request.getSession();  
	        session.setAttribute("name",name);  
	        response.sendRedirect("AfterLogin.jsp");
		}
		else
		{
			PrintWriter out = response.getWriter();
			out.println("<h1>Wrong username or password</h1>");
		}
	}

}
