package com.zhangmagle.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/book")
@RestController
public class BookController {
	
	@RequestMapping(value = "/{name}", method=RequestMethod.GET)
	public String getBook(@PathVariable String name) {
		return "retrieve book name: " + name;
	}
}
