package com.example.scalerecomm.dtos;

import com.example.scalerecomm.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductResponseDTO {
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private String category;

    public static CreateProductResponseDTO fromProduct(Product product){
        CreateProductResponseDTO response = new CreateProductResponseDTO();
        response.setTitle(product.getTitle());
        response.setDescription(product.getDescription());
        response.setPrice(product.getPrice());
        response.setImageUrl(product.getImageUrl());
        response.setCategory(product.getCategory());

        return response;
    }
}
