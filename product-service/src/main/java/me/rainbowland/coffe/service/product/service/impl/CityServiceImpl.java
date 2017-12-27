package me.rainbowland.coffe.service.product.service.impl;

import me.rainbowland.coffe.service.product.domain.City;
import me.rainbowland.coffe.service.product.repository.CityRepository;
import me.rainbowland.coffe.service.product.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/24.
 */
@Service
@Transactional
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> loadByStatus(int status) {
		return cityRepository.findByStatus(status);
	}
}
