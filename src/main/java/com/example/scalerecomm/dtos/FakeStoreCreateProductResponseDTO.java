package com.example.scalerecomm.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreCreateProductResponseDTO {
    private Long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private String image;
}
