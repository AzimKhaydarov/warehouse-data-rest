package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Input;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    Date getDate();
    Integer getWarehouse();
    Integer getSupplier();
    Integer getCurrency();
    Integer getInvoiceNumber();
    String getCode();

}
