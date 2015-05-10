package com.shinowit.test;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Test extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().write("Hello World"+new java.util.Date());
	}

	
	
}
