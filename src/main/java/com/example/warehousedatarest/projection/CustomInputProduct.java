package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.InputProduct;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();
    Integer getProduct();
    double getAmount();
    double getPrice();
    Date getExpireDate();
    Integer getInput();

}
