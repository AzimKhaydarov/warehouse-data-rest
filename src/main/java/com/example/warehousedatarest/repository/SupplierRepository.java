package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.Supplier;
import com.example.warehousedatarest.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "Ta'minotchi ro'yxati", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository <Supplier, Integer>{
boolean existsByNameAndPhoneNumber(String name, String phone_number);
boolean existsByPhoneNumber(String phone_number);
}
