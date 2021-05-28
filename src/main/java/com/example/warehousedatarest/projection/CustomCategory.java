package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();

    String getName();

    Category getParentCategory();

    boolean isActive();
}
