package com.zhangmagle.tutorial;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {
	
	public void print() {
		System.out.println(this.getClass().getSimpleName());
	}

}
