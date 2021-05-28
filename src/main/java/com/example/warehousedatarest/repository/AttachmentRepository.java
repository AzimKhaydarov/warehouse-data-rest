package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.Attachment;
import com.example.warehousedatarest.projection.CustomAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment" ,excerptProjection = CustomAttachment.class)
public interface  AttachmentRepository extends JpaRepository<Attachment, Integer> {

}
