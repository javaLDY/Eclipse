package com.shinowit.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.dao.BaseDao;
import com.shinowit.entity.Teacher;

public class TestAction extends ActionSupport{

	@Resource
	private BaseDao<Teacher> basedao;
	
	private Teacher tea;
	
	public String test(){
	
			return SUCCESS;
		
	}

	public String test1(){
		Object a = basedao.insert(tea);
		if(a!=null){
			return SUCCESS;
		}
		return INPUT;
	}
	
	public Teacher getTea() {
		return tea;
	}

	public void setTea(Teacher tea) {
		this.tea = tea;
	}
	
}
