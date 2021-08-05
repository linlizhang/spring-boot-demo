package com.zhangmagle.service.impl;

import org.springframework.stereotype.Service;

import com.zhangmagle.aspect.AspectValidation;
import com.zhangmagle.service.AnnotationService;

@Service
public class AnnotationServiceImpl implements AnnotationService {

	@Override
	@AspectValidation
	public void annotation() {
		System.out.println("annotaion package location verification");
	}
}
