package com.zhangmagle.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
public class ResourceAnnotationConfig {

	@Bean("demo3")
	public ResourceAnnotationDemo getDemo3() {
		return new ResourceAnnotationDemo();
	}
	
	@Bean("demo2")
	public ResourceAnnotationDemo getDemo2() {
		return new ResourceAnnotationDemo();
	}

}
