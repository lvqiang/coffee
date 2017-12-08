package me.rainbowland.coffee.service.coupon.service.impl;

import me.rainbowland.coffee.service.coupon.entity.CouponMemeber;
import me.rainbowland.coffee.service.coupon.repository.CouponMemberRepository;
import me.rainbowland.coffee.service.coupon.service.CouponMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/8.
 */
@Service
public class CouponMemberServiceImpl implements CouponMemberService{

	@Autowired
	private CouponMemberRepository couponMemberRepository;

	@Override
	public List<CouponMemeber> loadUserCouponList(Long userId) {
		return couponMemberRepository.findByUserId(userId);
	}
}
