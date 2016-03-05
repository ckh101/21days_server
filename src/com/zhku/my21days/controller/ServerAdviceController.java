package com.zhku.my21days.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhku.my21days.dao.AdviceDAO;
import com.zhku.my21days.util.CurrentUser;
import com.zhku.my21days.util.StringOper;
import com.zhku.my21days.vo.Advice;
import com.zhku.my21days.vo.AdviceExample;
import com.zhku.my21days.vo.SysUser;
import com.zhku.my21days.vo.AdviceExample;
import com.zhku.my21days.vo.SysUserExample;

@Controller
@RequestMapping("/serverAdvices")
public class ServerAdviceController {
	@Resource
	private AdviceDAO adviceDAO;
	@RequestMapping("/toList")
	public String getAdviceList(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		int pagesize=15;
		int offset=0;
		try{
			offset = Integer.parseInt(request.getParameter("offset"));
		}catch(Exception ignore){}
		AdviceExample ex1=new  AdviceExample ();
		 com.zhku.my21days.vo.AdviceExample .Criteria criteria1=ex1.createCriteria();
		 AdviceExample ex2=new  AdviceExample ();
		 com.zhku.my21days.vo.AdviceExample .Criteria criteria2=ex2.createCriteria();
		 ex1.setFromNumber(offset);
		 ex1.setMaxRowsPerPage(pagesize);
		 List<Advice> anylist= adviceDAO.selectByExample(ex1);
		int total=adviceDAO.countByExample(ex2);
		int currentPage = offset / pagesize + 1;
		int maxPage = total/ pagesize;
		if(total % pagesize != 0){
			maxPage = maxPage + 1;
		}
		request.setAttribute("offset", offset);
		request.setAttribute("pagesize", pagesize);
		request.setAttribute("maxPage", maxPage);
		String role=CurrentUser.getUserRole();
		//String username=request.getParameter("name");
		request.setAttribute("role", role);
		request.setAttribute("adviceList",anylist );
		return "/advicedata/list";
	}
	@RequestMapping("/toAdviceEdit")
	public String toAdviceedit(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		Advice ad=null;
		if(id!=null&&!"".equals(id)){
			Advice ad1=new Advice();
			ad1.setAdId(Integer.parseInt(id));
			ad=adviceDAO.selectByPrimaryKey(ad1);
		}
		
		if(ad!=null){
			request.setAttribute("ad", ad);
		}
		return "/advicedata/adviceEdit";
	}
	@RequestMapping("/saveAdvice")
	public void saveAdvice(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String change=request.getParameter("change");
		String part1=request.getParameter("part1");
		String part2=request.getParameter("part2");
		String part3=request.getParameter("part3");
		int type=Integer.parseInt(request.getParameter("type"));
		AdviceExample ex=new  AdviceExample();
		 com.zhku.my21days.vo.AdviceExample.Criteria criteria=ex.createCriteria();
		Advice ad=new Advice();
		 criteria.andNameEqualTo(change);
		 List<Advice> anylist= adviceDAO.selectByExample(ex);
		 ad.setName(change);
		 ad.setPart2(part2);
		 ad.setPart1(part1);
		 ad.setPart3(part3);
		 ad.setType(type);
		 if(id==null||"".equals(id)){
			 if(anylist.size()!=0){
				 StringOper.outJsonString(response, "{success:false,info:'改变项已存在'}");
				 return;
			 }else{
				
				 adviceDAO.insertSelective(ad);
				 StringOper.outJsonString(response, "{success:true,info:''}");
			 }
		 }else{
			 ad.setAdId(Integer.parseInt(id));
			adviceDAO.updateByPrimaryKeySelective(ad);
			 StringOper.outJsonString(response, "{success:true,info:''}");
		 }
	}
	@RequestMapping("/deleteAdvice")
	public void deleteAdvice(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
			String idsStr = request.getParameter("ids");
 		
 			java.util.List<Integer> idsList =new ArrayList();
 	    	String[]  idsArray= idsStr.split(",");
 	    	for(int i=0;i<idsArray.length;i++){
 	    		
 	    			idsList.add(Integer.parseInt(idsArray[i]));
 	    	}
 	    	AdviceExample ex=new  AdviceExample ();
 			 com.zhku.my21days.vo.AdviceExample .Criteria criteria=ex.createCriteria();
 			 criteria.andAdIdIn(idsList);
 			adviceDAO.deleteByExample(ex);
 			StringOper.outJsonString(response, "{success:true,info:''}");
	}
}
