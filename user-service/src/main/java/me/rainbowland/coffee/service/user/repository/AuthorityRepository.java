package me.rainbowland.coffee.service.user.repository;

import me.rainbowland.coffee.service.user.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lvqiang on 2017/12/5.
 */
@Repository
public interface  AuthorityRepository extends JpaRepository<Authority, Long> {
}
