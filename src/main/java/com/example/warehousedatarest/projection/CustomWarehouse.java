package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();
    String getName();
    boolean isActive();
}
