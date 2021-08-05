package com.zhangmagle.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnationPackageAspect {
	
	@Before("@annotation(AspectValidation)")
	public void packageVerification() {
		System.out.println("Spring can be enable this aspect or not");
	}

}
