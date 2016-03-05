package com.zhku.my21days.util;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class CurrentUser {
	 private static CurrentUser instance=null;
	 private  UserDetails userDetails;
	 public CurrentUser(){
		

	 }
	
	 public static String getUserName(){
		 
		 UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			String name =userDetails.getUsername();
			return name;
			
	 }
	 public static String getUserRole(){
		 UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		 Collection<? extends GrantedAuthority> auths = userDetails.getAuthorities();
			String role = "ROLE_USER";
			  Object[] ats = auths.toArray();
			  for(int i=0; i<ats.length; i++){
			   GrantedAuthority o = (GrantedAuthority)ats[i];
			   if("ROLE_ADMIN".equals(o.getAuthority())){
				   role = o.getAuthority();
			   }
			 }
			  return role;
	 }
}
