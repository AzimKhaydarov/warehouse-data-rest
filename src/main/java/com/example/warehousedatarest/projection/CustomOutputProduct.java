package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.InputProduct;
import com.example.warehousedatarest.entity.OutputProduct;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    Integer getProduct();
    double getAmount();
    double getPrice();

    Integer getOutput();

}
