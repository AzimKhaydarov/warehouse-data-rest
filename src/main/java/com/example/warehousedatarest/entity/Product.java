package com.example.warehousedatarest.entity;

import com.example.warehousedatarest.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends AbstractEntity {
    @ManyToOne(optional = false)
    private Category category;

    @OneToOne
    private Attachment photo;

    @ManyToOne(optional = false)
    private Measurement measurement;

    private String code;

}
