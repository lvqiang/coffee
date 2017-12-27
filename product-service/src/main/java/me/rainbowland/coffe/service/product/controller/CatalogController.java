package me.rainbowland.coffe.service.product.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.rainbowland.coffe.service.product.domain.Catalog;
import me.rainbowland.coffe.service.product.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/21.
 */
@RestController
@RequestMapping(value = "/catalogs")
@Api(value = "/catalogs", description = "产品目录类别API")
public class CatalogController {

	@Autowired
	private CatalogService catalogService;

	@RequestMapping(value = "/available", method = RequestMethod.GET)
	@ApiOperation(value = "产品开通列表")
	public List<Catalog> availableList() {
		return catalogService.loadByStatus(1);
	}

}