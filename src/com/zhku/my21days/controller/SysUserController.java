package com.zhku.my21days.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhku.my21days.dao.SysUserDAO;
import com.zhku.my21days.util.CurrentUser;
import com.zhku.my21days.util.StringOper;
import com.zhku.my21days.vo.SysUser;
import com.zhku.my21days.vo.SysUserExample;


@Controller
@RequestMapping("/sysUser")
public class SysUserController {
	@Resource
	SysUserDAO userDAO;
	@RequestMapping("/toList")
	public String toSysUserList(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
		String srch=request.getParameter("srch");
		
		int pagesize=15;
		int offset=0;
		try{
			offset = Integer.parseInt(request.getParameter("offset"));
		}catch(Exception ignore){}
		SysUserExample ex1=new  SysUserExample ();
		 com.zhku.my21days.vo.SysUserExample .Criteria criteria1=ex1.createCriteria();
		 SysUserExample ex2=new  SysUserExample ();
		 com.zhku.my21days.vo.SysUserExample .Criteria criteria2=ex2.createCriteria();
		 if(srch!=null&&!"".equals(srch)){
			 criteria1.andUserNameLike(srch);
		}
		 ex1.setFromNumber(offset);
		 ex1.setMaxRowsPerPage(pagesize);
		 List<SysUser> anylist= userDAO.selectByExample(ex1);
		int total=userDAO.countByExample(ex2);
		int currentPage = offset / pagesize + 1;
		int maxPage = total/ pagesize;
		if(total % pagesize != 0){
			maxPage = maxPage + 1;
		}
		request.setAttribute("offset", offset);
		request.setAttribute("pagesize", pagesize);
		request.setAttribute("maxPage", maxPage);
		String role=CurrentUser.getUserRole();
		String username=CurrentUser.getUserName();
		//String username=request.getParameter("name");
		request.setAttribute("role", role);
		request.setAttribute("username", username);
		request.setAttribute("userList",anylist );
		return "/sysuser/list";
	}
	@RequestMapping("/sysUserEdit")
	public String sysUserEdit(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
		String id=request.getParameter("userId");
		SysUser user=null;
		if(id!=null&&!"".equals(id)){
			SysUser user1=new SysUser();
			user1.setUserId(Integer.parseInt(id));
			user=userDAO.selectByPrimaryKey(user1);
		}
		
		if(user!=null){
			request.setAttribute("user", user);
		}
		return "/sysuser/sysUserEdit";
	}
	@RequestMapping("/saveUser")
	public void saveUser(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
		 String id=request.getParameter("id");
		String username=request.getParameter("name");
		 String password=request.getParameter("pwd");
		 String sex=request.getParameter("sex");
		 String phone=request.getParameter("tel");
		 String role=request.getParameter("role");
		 String realname=request.getParameter("realname");
		 String email=request.getParameter("mail");
		 String address=request.getParameter("lxdz");
		SysUserExample ex=new  SysUserExample ();
		 com.zhku.my21days.vo.SysUserExample .Criteria criteria=ex.createCriteria();
		 SysUser user=new SysUser();
		 criteria.andUserNameEqualTo(username);
		 List<SysUser> anylist= userDAO.selectByExample(ex);
		 user.setUserName(username);
		 user.setAddress(address);
		 if(role.equals("ROLE_ADMIN")){
			 user.setDescn("系统管理员");
		 }
		 if(role.equals("ROLE_USER")){
			 user.setDescn("普通管理员");
		 }
		 user.setEmali(email);
		 user.setPassword(password);
		 user.setPhone(phone);
		 user.setSex(sex);
		 user.setRealName(realname);
		 if(id==null||"".equals(id)){
			 if(anylist.size()!=0){
				 StringOper.outJsonString(response, "{success:false,info:+'"+username+"用户名已存在！！！'}");
				 return;
			 }
			 else{
				 userDAO.insertSelective(user);
				 StringOper.outJsonString(response, "{success:true,info:''}");
			 }
		 }else{
			 user.setUserId(Integer.parseInt(id));
			 userDAO.updateByPrimaryKeySelective(user);
			 StringOper.outJsonString(response, "{success:true,info:''}");
		 }
		 
		
	}
	@RequestMapping("/deleteUser")
	public void deleteUser(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
			String idsStr = request.getParameter("ids");
 		
 			java.util.List<Integer> idsList =new ArrayList();
 	    	String[]  idsArray= idsStr.split(",");
 	    	for(int i=0;i<idsArray.length;i++){
 	    		
 	    			idsList.add(Integer.parseInt(idsArray[i]));
 	    	}
 	    	SysUserExample ex=new  SysUserExample ();
 			 com.zhku.my21days.vo.SysUserExample .Criteria criteria=ex.createCriteria();
 			 criteria.andUserIdIn(idsList);
 			 userDAO.deleteByExample(ex);
 			StringOper.outJsonString(response, "{success:true,info:''}");
	}

}
