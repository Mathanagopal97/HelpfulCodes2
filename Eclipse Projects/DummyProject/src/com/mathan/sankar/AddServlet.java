package com.mathan.sankar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static ImplementClass  ic= new ImplementClass();
	public AddServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		ic.add(id, name);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Record Added</h1>");
		out.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<MainClass> mc = ic.mc;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h1>All the records</h1>");
		for (MainClass mc1 : mc) {
			out.println("Id :" + mc1.getId() + " Name :" + mc1.getName());
			out.println("<br>");
		}
		out.close();
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("URL = "+request.getRequestURI());
		System.out.println(request.getParameter("id"));
		int id = Integer.parseInt(request.getParameter("id"));
		ic.delete(id);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Record Deleted</h1>");
		out.close();

	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("id") + " Inside the DoPut " + request.getParameter("name"));
		System.out.println("URL = "+request.getRequestURI());
		System.out.println("" + request.getInputStream());
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		ic.update(id, name);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Record Updated</h1>");
		out.close();
	}

}
