package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.Warehouse;
import com.example.warehousedatarest.projection.CustomWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository <Warehouse, Integer>{
boolean existsByName(String name);
}
