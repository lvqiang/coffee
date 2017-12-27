package me.rainbowland.coffe.service.product.service.impl;

import me.rainbowland.coffe.service.product.domain.Catalog;
import me.rainbowland.coffe.service.product.repository.CatalogRepository;
import me.rainbowland.coffe.service.product.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/24.
 */
@Service
@Transactional
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	private CatalogRepository catalogRepository;

	@Override
	public List<Catalog> loadByStatus(int status) {
		return catalogRepository.findByStatus(status);
	}
}
