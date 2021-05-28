package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.OutputProduct;
import com.example.warehousedatarest.projection.CustomOutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {

}
