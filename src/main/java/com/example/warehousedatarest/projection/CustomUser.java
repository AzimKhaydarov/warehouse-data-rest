package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getCode();
    String getPassword();
}
