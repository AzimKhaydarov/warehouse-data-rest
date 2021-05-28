package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.Input;
import com.example.warehousedatarest.projection.CustomInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "input", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {

}
