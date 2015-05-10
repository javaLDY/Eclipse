package com.shinowit.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName="log",servletNames="TestServlet1")
public class TestFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		long before = System.currentTimeMillis();
		System.out.println(before);
		HttpServletRequest newrequest = (HttpServletRequest)request;
		System.out.println(newrequest.getServletPath());
		long after = System.currentTimeMillis();
		System.out.println(after);
		System.out.println("拦截器一共用了"+(after-before));
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		
		
	}

}
