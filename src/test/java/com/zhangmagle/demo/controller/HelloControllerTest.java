package com.zhangmagle.demo.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.zhangmagle.controller.HelloController;
import com.zhangmagle.service.HelloService;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private HelloService service;
	
	@Test
	public void hello() throws Exception {
		when(service.hello("world")).thenReturn("Hello world");
		
		this.mockMvc.perform(get("/hello/world")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string("Hello world"));
		
	}
}
