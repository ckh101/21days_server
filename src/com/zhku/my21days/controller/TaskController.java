package com.zhku.my21days.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhku.my21days.dao.TaskDAO;
import com.zhku.my21days.vo.Task;
import com.zhku.my21days.vo.TaskExample;

@Controller
@RequestMapping("/task")
public class TaskController {
	@Resource
	private TaskDAO taskDAO;
	@RequestMapping("/getTask")
    public void getTask(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String userId=request.getParameter("userId");
		TaskExample ex=new TaskExample();
		com.zhku.my21days.vo.TaskExample.Criteria criteria=ex.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<Task> anylist= taskDAO.selectByExample(ex);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	
		out.println("<?xml version='1.0' encoding='UTF-8'?>");
		
		out.println("<tasklist>");
			for (int i = 0; i <anylist.size(); i++) {
				Task ay= (Task)anylist.get(i);
				out.println("<task>");
					out.print("<content>");
					 	out.print(ay.getContent());
					out.println("</content>");
					out.print("<change>");
					 	out.print(ay.getChangeSelf());
					out.println("</change>");
					out.print("<date1>");
				 		out.print(ay.getDate1());
				 	out.println("</date1>");
				 	out.print("<time>");
				 		out.print(ay.getTime());
				 	out.println("</time>");
				 	out.print("<onoff>");
				 		out.print(ay.getOnoff());
				 	out.println("</onoff>");
				 	out.print("<alarm>");
				 		out.print(ay.getAlarm());
				 	out.println("</alarm>");
				 	out.print("<dates>");
				 		out.print(ay.getDates());
				 	out.println("</dates>");
				 	out.print("<status>");
			 			out.print(ay.getStatus());
			 		out.println("</status>");
			 		out.print("<reward>");
		 				out.print(ay.getReward());
		 			out.println("</reward>");
		 			out.print("<punishment>");
	 					out.print(ay.getPunishment());
	 				out.println("</punishment>");
	 				out.print("<alarmnum>");
 						out.print(ay.getAlarmnum());
 					out.println("</alarmnum>");
 					out.print("<created>");
						out.print(sdf.format(ay.getCreate()));
					out.println("</created>");
				out.println("</task>");
			}
		out.println("</tasklist>");
   	 
    }
	@RequestMapping("/saveTask")
    public void saveOrUpdateTask(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		Task task=new Task();
		TaskExample ex=new TaskExample();
		com.zhku.my21days.vo.TaskExample.Criteria criteria=ex.createCriteria();
		String flag=request.getParameter("flag");
		if("true".equals(flag)){
			int alarm=Integer.parseInt(request.getParameter("alarm"));
			
			String change=request.getParameter("change");
			String date1=request.getParameter("date1");
			String time=request.getParameter("time");
			int onoff=Integer.parseInt(request.getParameter("onoff"));
			String reward=request.getParameter("reward");
			String punishment=request.getParameter("punishment");
			String content=request.getParameter("content");
			task.setAlarm(alarm);
			
			task.setChangeSelf(change);
			task.setContent(content);
			task.setDate1(date1);
			task.setOnoff(onoff);
			task.setPunishment(punishment);
			task.setReward(reward);
			task.setTime(time);
		}
		int taid=Integer.parseInt(request.getParameter("taid"));
		String userId=request.getParameter("userId");
		int alarmnum=Integer.parseInt(request.getParameter("alarmnum"));
		int dates=Integer.parseInt(request.getParameter("dates"));
		int status=Integer.parseInt(request.getParameter("status"));
		task.setStatus(status);
		task.setUserId(userId);
		task.setDates(dates);
		task.setAlarmnum(alarmnum);
		if(taid==0){
			taskDAO.insertSelective(task);
		}else{
			criteria.andUserIdEqualTo(userId);
			criteria.andAlarmnumEqualTo(alarmnum);
			taskDAO.updateByExampleSelective(task, ex);
		}
		
		
    }
	@RequestMapping("/deleTask")
	public void deleteTask(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String userId=request.getParameter("userId");
		int alarmnum=Integer.parseInt(request.getParameter("alarmnum"));
		TaskExample ex=new TaskExample();
		com.zhku.my21days.vo.TaskExample.Criteria criteria=ex.createCriteria();
		criteria.andAlarmnumEqualTo(alarmnum);
		criteria.andUserIdEqualTo(userId);
		taskDAO.deleteByExample(ex);
    }
}
