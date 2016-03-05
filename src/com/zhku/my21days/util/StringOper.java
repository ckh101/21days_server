package com.zhku.my21days.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;



public class StringOper {
	public static  void outJsonString(HttpServletResponse response, String jsonStr) {
		try {
			response.setContentType("text/html");  // "text/html; charset=UTF-8"
			response.setCharacterEncoding("UTF-8");			
			PrintWriter out = response.getWriter();
			out.write(jsonStr);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static boolean isNotEmpty(String str){
		return StringUtils.isEmpty(str);
	}
}
