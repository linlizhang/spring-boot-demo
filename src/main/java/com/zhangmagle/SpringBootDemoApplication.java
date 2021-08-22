package com.zhangmagle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = {"aspect", "com.zhangmagle.*"})
@EnableJpaRepositories(basePackages = {"com.zhangmagle.repository.*"})
@EntityScan(basePackages = {"com.zhangmagle.internal.*"})
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
