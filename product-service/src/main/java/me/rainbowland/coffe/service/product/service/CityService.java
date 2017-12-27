package me.rainbowland.coffe.service.product.service;

import me.rainbowland.coffe.service.product.domain.City;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/24.
 */
public interface CityService {

	List<City> loadByStatus(int status);
}
