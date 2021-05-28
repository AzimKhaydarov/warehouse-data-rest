package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.Currency;
import com.example.warehousedatarest.projection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository <Currency, Integer>{
boolean existsByName(String name);
}
