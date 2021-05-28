package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();
    String getName();
    boolean isActive();
}
