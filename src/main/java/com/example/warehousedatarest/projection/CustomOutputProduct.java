package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.InputProduct;
import com.example.warehousedatarest.entity.Output;
import com.example.warehousedatarest.entity.OutputProduct;
import com.example.warehousedatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    Product getProduct();
    double getAmount();
    double getPrice();

    Output getOutput();

}
