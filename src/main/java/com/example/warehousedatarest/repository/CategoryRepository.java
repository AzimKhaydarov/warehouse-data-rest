package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.Category;
import com.example.warehousedatarest.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", collectionResourceRel = "list", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
