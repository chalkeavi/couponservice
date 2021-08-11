package com.avinash.springCloud.couponservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avinash.springCloud.couponservice.model.User;

public interface UserRepo extends JpaRepository<User, Long>{
	
	

}
