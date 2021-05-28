package com.example.warehousedatarest.entity;

import com.example.warehousedatarest.entity.template.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Currency extends AbstractEntity {


}
