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

import com.zhku.my21days.dao.QuestionDAO;
import com.zhku.my21days.vo.Analys;
import com.zhku.my21days.vo.Question;
import com.zhku.my21days.vo.QuestionExample;

@Controller
@RequestMapping("/question")
public class QuestionController {
	@Resource
	private QuestionDAO questionDAO;
	@RequestMapping("/getQuestion")
	public void getQuestion(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/xml");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		QuestionExample ex=new QuestionExample();
		com.zhku.my21days.vo.QuestionExample.Criteria criteria=ex.createCriteria();
		List<Question> queslist=questionDAO.selectByExample(ex);

		out.println("<?xml version='1.0' encoding='UTF-8'?>");
		
		out.println("<questionlist>");
			for (int i = 0; i <queslist.size(); i++) {
				Question quest= (Question)queslist.get(i);
				out.println("<questions>");
					
					out.print("<qnum>");
						out.print(quest.getQnum());
					out.println("</qnum>");
				
					out.print("<question>");
						out.print(quest.getQuestion());
					out.println("</question>");
				
					
				out.println("</questions>");
			}
		out.println("</questionlist>");
	}
}
