package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.Client;
import com.example.warehousedatarest.projection.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", collectionResourceRel = "list", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository <Client, Integer>{
boolean existsByName(String name);
}
