package com.zhangmagle.web;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomizedFilter implements Filter {
	
	Logger logger = LoggerFactory.getLogger(CustomizedFilter.class);
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
		
		logger.info("doFilter in CustomizedFilter");
		chain.doFilter(request, response);
		
	}

}
