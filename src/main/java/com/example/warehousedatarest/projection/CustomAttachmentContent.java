package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();
    byte getBytes();
    Integer getAttachment();
}
