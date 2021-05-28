package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.InputProduct;
import com.example.warehousedatarest.projection.CustomInputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct", excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {

}
