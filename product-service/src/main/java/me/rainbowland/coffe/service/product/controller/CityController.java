package me.rainbowland.coffe.service.product.controller;

import me.rainbowland.coffe.service.product.model.City;
import me.rainbowland.coffe.service.product.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/21.
 */
@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private ICityService cityService;

	@GetMapping("/availableList")
	public List<City> home(){
		return cityService.getAvailableList();
	}

}
