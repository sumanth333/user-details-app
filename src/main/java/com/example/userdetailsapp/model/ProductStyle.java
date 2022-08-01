package com.example.userdetailsapp.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Getter
@Entity
@Table(name = "product_style")
public class ProductStyle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String styleNumber;
    private String description;
    @Column(name = "bddcs")
    private String brandDivisionDepartmentClassSubclass;
    private String taxCodeStatus;
    private String merchandiseTaxCode;
    private String taxCode;
}
