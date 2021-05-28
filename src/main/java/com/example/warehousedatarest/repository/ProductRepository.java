package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.Product;
import com.example.warehousedatarest.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
    boolean existsByNameAndCategory_Id(String name, Integer category_id);
boolean existsByNameAndPhoto_Id(String name, Integer photo_id);
}
