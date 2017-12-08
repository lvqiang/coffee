package me.rainbowland.coffee.service.coupon.repository;

import me.rainbowland.coffee.service.coupon.entity.CouponMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by lvqiang on 2017/12/5.
 */
@Repository
public interface CouponMemberRepository extends JpaRepository<CouponMember, Long> {
	List<CouponMember> findByUserId(Long userId);
}
