package com.mathan.sankar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContClass {
	
	@RequestMapping("/")
	public String defaultReq()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/LoginServlet")
	public String login(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		if (name.equals("mathan") && pass.equals("mathan123")) {
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
		} else {
			PrintWriter out = response.getWriter();
			out.println("<h1>Wrong username or password</h1>");
		}
		return "index.jsp";
	}
	
	@RequestMapping("/LogoutServlet")
	public String logout(HttpServletRequest request, HttpServletResponse response)
	{
		HttpSession session=request.getSession();
		if(session!=null)
		{
			session.removeAttribute("name");
	        session.invalidate();	  
		}
		return "index.jsp";
	}

}
