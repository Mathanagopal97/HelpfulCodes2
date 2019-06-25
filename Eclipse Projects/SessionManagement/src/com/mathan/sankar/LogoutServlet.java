package com.mathan.sankar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogoutServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			HttpSession session=request.getSession();
			if(session!=null)
			{
				session.removeAttribute("name");
		        session.invalidate();	  
		        response.sendRedirect("login.jsp");
			}
			else
			{
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/LoginPage.html");
				PrintWriter out = response.getWriter();
				out.println(
						"<p style = 'text-align:center'><font color=red>Login First</font></p>");
				rd.include(request, response);
			}

	}
}
