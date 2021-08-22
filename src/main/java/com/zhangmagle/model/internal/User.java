package com.zhangmagle.model.internal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
