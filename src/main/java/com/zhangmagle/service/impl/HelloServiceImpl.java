package com.zhangmagle.service.impl;

import org.springframework.stereotype.Service;

import com.zhangmagle.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "Hello " + name;
	}

}
