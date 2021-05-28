package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Currency;
import com.example.warehousedatarest.entity.Input;
import com.example.warehousedatarest.entity.Supplier;
import com.example.warehousedatarest.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    Date getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getInvoiceNumber();
    String getCode();

}
