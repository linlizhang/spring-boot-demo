package com.zhangmagle.service.impl;

import org.springframework.stereotype.Service;

import com.zhangmagle.service.HelloService;

import aspect.LogExecution;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	@LogExecution
	public String hello(String name) {
		return "Hello " + name;
	}

}
