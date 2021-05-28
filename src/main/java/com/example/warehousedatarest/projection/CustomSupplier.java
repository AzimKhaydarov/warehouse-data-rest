package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getName();
    String getPhoneNumber();
    boolean isActive();

}
