package com.zhangmagle.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.zhangmagle.model.internal.User;

@SpringBootTest
@EnableJpaRepositories(basePackages = {"com.zhangmagle"})
public class UserRepositoyTest {
	
	@Autowired
	private UserRepository userRepo;
	
	@Test
	public void saveUser() {
		User user = new User();
		user.setId(100L);
		userRepo.save(user);
	}

}
