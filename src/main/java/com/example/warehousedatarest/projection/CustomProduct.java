package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
   Integer getId();
   String getName();
   Integer getCategory();
   Integer getPhoto();
   String getCode();
   Integer getMeasurement();
   boolean isActive();
}
