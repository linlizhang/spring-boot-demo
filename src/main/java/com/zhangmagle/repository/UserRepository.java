package com.zhangmagle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zhangmagle.model.internal.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
