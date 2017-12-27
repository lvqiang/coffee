package me.rainbowland.coffee.service.coupon.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.rainbowland.coffee.service.coupon.entity.CouponMember;
import me.rainbowland.coffee.service.coupon.service.CouponMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/8.
 */
@RestController
@RequestMapping(value = "/members")
@Api(value = "/members", description = "用户优惠券API")
public class CouponMemberController {

	@Autowired
	private CouponMemberService couponMemberService;

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	@ApiOperation(value = "用户优惠券列表")
	public List<CouponMember> loadByUserId(@PathVariable("userId") String userId) {
		return couponMemberService.loadByUserId(userId);
	}
}
