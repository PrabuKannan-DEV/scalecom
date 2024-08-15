package com.example.scalerecomm.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String title;
    private double price;
    private String category;
    private String imageUrl;
    private String description;
}
