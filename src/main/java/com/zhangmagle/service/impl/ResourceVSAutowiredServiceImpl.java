package com.zhangmagle.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zhangmagle.tutorial.Shape;

@Service
public class ResourceVSAutowiredServiceImpl {
	
	/* only using @Autowired annotation, it will raise below exception:
	 * org.springframework.beans.factory.BeanCreationException: 
	 * Error creating bean with name 'resourceVSAutowiredServiceImpl': 
	 * Injection of resource dependencies failed; nested exception is
	 *  org.springframework.beans.factory.NoUniqueBeanDefinitionException:
	 *   No qualifying bean of type 'com.zhangmagle.tutorial.Shape' available:
	 *    expected single matching bean but found 2: square,triangle
	 */
	@Autowired
	@Qualifier("square")
	private Shape anyName;
	
	@Resource
	private Shape square;
	
	@Resource
	private Shape triangle;
	
	
	public void println() {
		anyName.print();
		square.print();
		triangle.print();
	}

	
}
