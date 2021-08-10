package com.zhangmagle.tutorial.duplicated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class DuplicatedResourceAnnotationBeanConfig {
	
	@Bean("duplicatedDemo3")
	public ResourceAnnotationDemo getDemo3() {
		return new ResourceAnnotationDemo();
	}
	
	@Bean("duplicatedDemo2")
	public ResourceAnnotationDemo getDemo2() {
		return new ResourceAnnotationDemo();
	}

}
