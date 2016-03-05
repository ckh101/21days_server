package com.zhku.my21days.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhku.my21days.dao.AdviceDAO;
import com.zhku.my21days.util.CurrentUser;
import com.zhku.my21days.vo.Advice;
import com.zhku.my21days.vo.AdviceExample;
import com.zhku.my21days.vo.Analys;

@Controller
@RequestMapping("/advices")
public class AdvicesController {
	@Resource
	private AdviceDAO adviceDAO;
	@RequestMapping("/getAdvices")
    public void getAdvices(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		AdviceExample ex=new AdviceExample();
		com.zhku.my21days.vo.AdviceExample.Criteria criteria=ex.createCriteria();
		List<Advice> anylist= adviceDAO.selectByExample(ex);

		out.println("<?xml version='1.0' encoding='UTF-8'?>");
		
		out.println("<adviceslist>");
			for (int i = 0; i <anylist.size(); i++) {
				Advice ay= (Advice)anylist.get(i);
				out.println("<advices>");
					
					out.print("<type>");
						out.print(ay.getType());
					out.println("</type>");
				
					out.print("<name>");
						out.print(ay.getName());
					out.println("</name>");
					out.print("<part1>");
					out.print(ay.getPart1());
					out.println("</part1>");
				
					out.print("<part2>");
					out.print(ay.getPart2());
					out.println("</part2>");
					out.print("<part3>");
					out.print(ay.getPart3());
					out.println("</part3>");
						
					out.println("</advices>");
			}
		out.println("</adviceslist>");
   	 
    }
	
}
