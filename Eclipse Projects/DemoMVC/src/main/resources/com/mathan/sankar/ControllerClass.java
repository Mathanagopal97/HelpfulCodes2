package com.mathan.sankar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerClass 
{
	
	@RequestMapping("/func")
	public String func()
	{
		System.out.println("im here");
		return "index.jsp";
	}

}
