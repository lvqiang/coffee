package me.rainbowland.coffe.service.product.repository;

import me.rainbowland.coffe.service.product.entity.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lvqiang on 2017/11/24.
 */
@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long> {

	List<Catalog> findByStatus(int status);
}