package com.avinash.springCloud.couponservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avinash.springCloud.couponservice.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long>{


	Coupon findByCode(String code);
	
	
}
