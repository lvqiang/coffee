package me.rainbowland.coffe.service.product.service.impl;

import me.rainbowland.coffe.service.product.model.City;
import me.rainbowland.coffe.service.product.repository.CityRepository;
import me.rainbowland.coffe.service.product.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/24.
 */
@Service
@Transactional
public class CityServiceImpl implements ICityService{

	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> getAvailableList() {
		return cityRepository.findByStatus(1);
	}
}
