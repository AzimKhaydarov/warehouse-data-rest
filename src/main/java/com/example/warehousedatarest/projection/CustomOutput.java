package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Input;
import com.example.warehousedatarest.entity.Output;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Date getDate();
    Integer getWarehouse();
    Integer getClient();
    Integer getCurrency();
    Integer getInvoiceNumber();
    String getCode();

}
