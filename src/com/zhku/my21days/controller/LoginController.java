package com.zhku.my21days.controller;

import java.util.Calendar;
import java.util.Collection;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zhku.my21days.util.CurrentUser;

@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("/toIndex")
	public String toIndex(HttpServletRequest request,HttpServletResponse response){
		String username=CurrentUser.getUserName();
		Calendar curdate=Calendar.getInstance();
		StringBuilder time=new StringBuilder();
		time.append(curdate.get(curdate.YEAR)).append("年").append(curdate.get(curdate.MONTH)+1).append("月").append(curdate.get(curdate.DAY_OF_MONTH)).append("日");
		String week=null;
		int day=curdate.get(curdate.DAY_OF_WEEK);
		if (day == 2) {  
            time.append(",").append("星期一");  
        } else if (day == 3) {  
        	  time.append(",").append("星期二");   
        } else if (day == 4) {  
        	  time.append(",").append("星期三");   
        } else if (day == 5) {  
        	  time.append(",").append("星期四");  
        } else if (day == 6) {  
        	  time.append(",").append("星期五");  
        } else if (day == 7) {  
        	  time.append(",").append("星期六");  
        } else if (day == 1) {  
        	  time.append(",").append("星期日");  
        }  
		String role=CurrentUser.getUserRole();
		request.setAttribute("date", time);
		request.setAttribute("user", username);
		request.setAttribute("role", role);
		return "/index";
	}
	@RequestMapping("/toMain")
	public String toMain(HttpServletRequest request,HttpServletResponse response){
		return "/main1";
	}
}