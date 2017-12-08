package me.rainbowland.coffee.service.coupon.service;

import me.rainbowland.coffee.service.coupon.entity.CouponMemeber;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/5.
 */
public interface CouponMemberService {

	List<CouponMemeber> loadUserCouponList(Long userId);
}
