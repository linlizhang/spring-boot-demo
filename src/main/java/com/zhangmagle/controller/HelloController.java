package com.zhangmagle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhangmagle.service.AnnotationService;
import com.zhangmagle.service.HelloService;
import com.zhangmagle.service.impl.ResourceVSAutowiredServiceImpl;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@Autowired
	private AnnotationService annotationService;
	
	@Autowired
	private ResourceVSAutowiredServiceImpl annationServicep;

	@RequestMapping(value = "/{name}", method=RequestMethod.GET)
	public String hello(@PathVariable String name) {
		annationServicep.println();
		return helloService.hello(name);
		
	}
	
	@RequestMapping(value = "/annotation", method=RequestMethod.GET)
	public void annotate() {
		annotationService.annotation();
	}
}
