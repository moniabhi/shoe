package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AdminController {

	@Autowired
	AdminRepo repo;
//	
//	@Autowired
//	AdminDao dao;

	Logger log=Logger.getAnonymousLogger();

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
//		if(username.equals("murali")&& password.equals("123")) {
		if(repo.findbyusername(username).equals(repo.findbypassword(password))) {			
	
			HttpSession session=req.getSession();
			session.setAttribute("username", username);
			mv.setViewName("success.jsp");
		}else
		{
			mv.setViewName("failure.jsp");
		}
		log.info("tested3");
		return mv;

	}
}
