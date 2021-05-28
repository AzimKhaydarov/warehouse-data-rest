package com.example.warehousedatarest.entity;

import com.example.warehousedatarest.entity.template.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Category extends AbstractEntity {


    @ManyToOne
    private Category parentCategory;



}
