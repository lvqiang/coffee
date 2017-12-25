package me.rainbowland.coffee.service.auth.repository;

import me.rainbowland.coffee.service.auth.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lvqiang on 2017/12/5.
 */
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long>{
}
