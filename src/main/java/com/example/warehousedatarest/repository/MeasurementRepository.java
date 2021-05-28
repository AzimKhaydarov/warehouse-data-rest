package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.Measurement;
import com.example.warehousedatarest.projection.CustomMeasurement;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "measurement", collectionResourceRel = "list", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository <Measurement, Integer>{
boolean existsByName(String name);

}
