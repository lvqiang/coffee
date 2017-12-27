package me.rainbowland.coffe.service.product.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.rainbowland.coffe.service.product.domain.City;
import me.rainbowland.coffe.service.product.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/21.
 */
@RestController
@RequestMapping(value = "/cities")
@Api(value = "/cities", description = "产品开通城市API")
public class CityController {

	@Autowired
	private CityService cityService;

	@RequestMapping(value = "/available", method = RequestMethod.GET)
	@ApiOperation(value = "产品开通城市列表")
	public List<City> availableList() {
		return cityService.loadByStatus(1);
	}

}
