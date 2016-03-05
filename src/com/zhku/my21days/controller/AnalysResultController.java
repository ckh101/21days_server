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

import com.zhku.my21days.dao.AnalysDAO;
import com.zhku.my21days.vo.Analys;
import com.zhku.my21days.vo.AnalysExample;
@Controller
@RequestMapping("/analys")
public class AnalysResultController {
	@Resource
	private AnalysDAO analysDAO;
	@RequestMapping("/getResult")
     public void getResult(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		AnalysExample ex=new AnalysExample();
		com.zhku.my21days.vo.AnalysExample.Criteria criteria=ex.createCriteria();
		List<Analys> anylist=analysDAO.selectByExample(ex);

		out.println("<?xml version='1.0' encoding='UTF-8'?>");
		
		out.println("<resultlist>");
			for (int i = 0; i <anylist.size(); i++) {
				Analys ay= (Analys)anylist.get(i);
				out.println("<results>");
					
					out.print("<animal>");
						out.print(ay.getAnimal());
					out.println("</animal>");
				
					out.print("<dicript>");
						out.print(ay.getDicrip());
					out.println("</dicript>");
				
					
				out.println("</results>");
			}
		out.println("</resultlist>");
    	 
     }
}
