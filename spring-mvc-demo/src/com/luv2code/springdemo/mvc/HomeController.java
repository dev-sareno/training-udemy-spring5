package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}

	@RequestMapping("/usingModel")
	public String showPage(HttpServletRequest request, Model model) {
		String param = request.getParameter("param");
		param = "Yo! " + param.toUpperCase();
		model.addAttribute("message", param);
		return "using-model";
	}
}
