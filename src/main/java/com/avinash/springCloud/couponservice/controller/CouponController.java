package com.avinash.springCloud.couponservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avinash.springCloud.couponservice.model.Coupon;
import com.avinash.springCloud.couponservice.repos.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponController {
	
	@Autowired
	CouponRepo couponRepo;
	
	@RequestMapping(value = "/coupons", method = RequestMethod.POST)
	public Coupon createCoupon(@RequestBody Coupon coupon) {		
		return couponRepo.save(coupon);
	}

	@RequestMapping(value = "/coupon/{code}", method = RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code)
	{
		return couponRepo.findByCode(code);
	}
}
