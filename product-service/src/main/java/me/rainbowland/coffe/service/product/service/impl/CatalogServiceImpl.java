package me.rainbowland.coffe.service.product.service.impl;

import me.rainbowland.coffe.service.product.entity.Catalog;
import me.rainbowland.coffe.service.product.repository.CatalogRepository;
import me.rainbowland.coffe.service.product.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/24.
 */
@Service
@Transactional
public class CatalogServiceImpl implements ICatalogService{

	@Autowired
	private CatalogRepository catalogRepository;

	@Override
	public List<Catalog> getAvailableList() {
		return catalogRepository.findByStatus(1);
	}
}
