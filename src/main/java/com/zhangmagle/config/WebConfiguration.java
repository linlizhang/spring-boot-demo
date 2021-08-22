package com.zhangmagle.config;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zhangmagle.web.CustomizedListener;
import com.zhangmagle.web.CustomizedServlet;

@Configuration
public class WebConfiguration {
	
//	@Bean
//	public ServletRegistrationBean<CustomizedServlet> customizedServletBean() {
//		ServletRegistrationBean<CustomizedServlet> bean = new ServletRegistrationBean<>(new CustomizedServlet(), "/servlet");
//		return bean;
//	}
	
	@Bean
	public ServletListenerRegistrationBean<CustomizedListener> customizedListenerBean() {
		ServletListenerRegistrationBean<CustomizedListener> bean = new ServletListenerRegistrationBean<>();
		bean.setListener(new CustomizedListener());
		return bean;
	}

}
