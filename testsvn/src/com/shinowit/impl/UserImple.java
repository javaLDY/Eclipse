package com.shinowit.impl;

import java.util.List;

import com.shinowit.model.UserInfo;
import com.shinowit.model.logininfo;

public interface UserImple {

	public boolean userinsert(UserInfo user);
	
	public List<UserInfo> userlist(UserInfo user);
	
	public boolean logininfoinsert(logininfo login);
	
}
