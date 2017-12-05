package me.rainbowland.coffe.service.product.service;

import me.rainbowland.coffe.service.product.entity.Catalog;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/24.
 */
public interface ICatalogService {

	List<Catalog> getAvailableList();
}
