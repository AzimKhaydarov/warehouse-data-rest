package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    boolean isActive();
}
