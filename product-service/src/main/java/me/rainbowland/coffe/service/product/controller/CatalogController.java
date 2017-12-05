package me.rainbowland.coffe.service.product.controller;

import me.rainbowland.coffe.service.product.entity.Catalog;
import me.rainbowland.coffe.service.product.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/21.
 */
@RestController
@RequestMapping("/catalog")
public class CatalogController {

	@Autowired
	private ICatalogService catalogService;

	@GetMapping("/availableList")
	public List<Catalog> availableList(){
		return catalogService.getAvailableList();
	}

}
