package com.zhangmagle.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomizedListener implements ServletContextListener {

	Logger logger = LoggerFactory.getLogger(CustomizedListener.class);
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		logger.info("initialize listener in CustomizedListener");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		logger.info("CustomizedListener is destroyed");
		
	}
}
