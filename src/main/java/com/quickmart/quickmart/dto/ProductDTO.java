package com.quickmart.quickmart.dto;

import com.quickmart.quickmart.model.Category;
import jakarta.persistence.*;

public class ProductDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categor_id",referencedColumnName =  "category_id")
    private int categoryId;
    private double price;
    private double weight;
    private String description;

    private String image;
}

