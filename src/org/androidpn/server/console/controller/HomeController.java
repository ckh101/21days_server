package org.androidpn.server.console.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
@Controller
@RequestMapping("/home")
public class HomeController extends MultiActionController{
	@RequestMapping("/homePage")
	public String toHome(HttpServletRequest request,HttpServletResponse response){
		return "/androidpn";
	}
}
