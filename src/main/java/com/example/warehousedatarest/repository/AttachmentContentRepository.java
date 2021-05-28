package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.AttachmentContent;
import com.example.warehousedatarest.projection.CustomAttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
@RepositoryRestResource(path = "attachmentContent", excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository <AttachmentContent, Integer>{

    Optional<AttachmentContent> findByAttachmentId(Integer id);

}
