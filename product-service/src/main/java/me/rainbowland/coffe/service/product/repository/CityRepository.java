package me.rainbowland.coffe.service.product.repository;

import me.rainbowland.coffe.service.product.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/24.
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {

	List<City> findByStatus(int status);
}
