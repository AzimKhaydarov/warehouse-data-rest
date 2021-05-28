package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Input;
import com.example.warehousedatarest.entity.InputProduct;
import com.example.warehousedatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();
    Product getProduct();
    double getAmount();
    double getPrice();
    Date getExpireDate();
    Input getInput();

}
