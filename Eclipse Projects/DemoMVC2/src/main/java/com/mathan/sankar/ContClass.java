package com.mathan.sankar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ContClass {
	public static ImplementClass  ic= new ImplementClass();

	@RequestMapping(value="/REST", method = { RequestMethod.POST })
	public void add(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		ic.add(id, name);
		PrintWriter pw = res.getWriter();
		pw.println("Record  Inserted");
	}
	
	@RequestMapping(value="/REST", method = { RequestMethod.GET })
	public void display(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		ArrayList<MainClass> mc = ic.mc;
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>All the records</h1>");
		for (MainClass mc1 : mc) {
			out.println("Id :" + mc1.getId() + " Name :" + mc1.getName());
			out.println("<br>");
		}
		out.close();
	}
	
	@RequestMapping(value="/REST", method = { RequestMethod.PUT })
	public void change(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		ic.update(id, name);
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Record Updated</h1>");
		out.close();
	}
	
	@RequestMapping(value="/REST", method = { RequestMethod.DELETE })
	public void delete(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int id = Integer.parseInt(req.getParameter("id"));
		ic.delete(id);
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Record Deleted</h1>");
		out.close();
	}
}
