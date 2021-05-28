package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Date getDate();
    Warehouse getWarehouse();
    Client getClient();
    Currency getCurrency();
    String getInvoiceNumber();
    String getCode();

}
