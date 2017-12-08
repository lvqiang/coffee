package me.rainbowland.coffee.service.coupon.controller;

import me.rainbowland.coffee.service.coupon.entity.CouponMemeber;
import me.rainbowland.coffee.service.coupon.service.CouponMemberService;
import me.rainbowland.coffee.service.coupon.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/8.
 */
@RestController
@RequestMapping(value = "/couponMember")
public class CouponMemberController {

	@Autowired
	private CouponMemberService couponMemberService;

	@GetMapping(value = "/listByUser")
	public List<CouponMemeber> listByUser() {
		long userId = SecurityUtils.getCurrentUserUsername().getId();
		return couponMemberService.loadUserCouponList(userId);
	}
}
