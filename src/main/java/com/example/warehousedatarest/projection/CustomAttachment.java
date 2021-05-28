package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();
    String getName();
    Long getSize();
    String getContentType();

}
