package com.zhangmagle.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// webServlet annotation works with @ServletComponentScan
@WebServlet(urlPatterns = {"/servlet"})
public class CustomizedServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	Logger logger = LoggerFactory.getLogger(CustomizedServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		logger.info("doGet in CustomizedServlet");
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<p>Customized servlet mapping!</p>");
	}
}
