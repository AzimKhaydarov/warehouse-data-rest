package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Attachment;
import com.example.warehousedatarest.entity.Category;
import com.example.warehousedatarest.entity.Measurement;
import com.example.warehousedatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
   Integer getId();
   String getName();
   Category getCategory();
   Attachment getPhoto();
   String getCode();
   Measurement getMeasurement();
   boolean isActive();
}
