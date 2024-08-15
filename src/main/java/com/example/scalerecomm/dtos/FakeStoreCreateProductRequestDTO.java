package com.example.scalerecomm.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreCreateProductRequestDTO {
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
