package me.rainbowland.coffee.service.user.repository;

import me.rainbowland.coffee.service.user.domain.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lvqiang on 2017/12/5.
 */
@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, Long>{
	List<UserAddress> findByUserId(String userId);
}
