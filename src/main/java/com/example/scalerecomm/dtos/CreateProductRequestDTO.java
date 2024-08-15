package com.example.scalerecomm.dtos;

import com.example.scalerecomm.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestDTO {
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private String category;

    public Product toProduct(){
        Product product = new Product();
        product.setTitle(this.title);
        product.setDescription(this.description);
        product.setPrice(this.price);
        product.setImageUrl(this.imageUrl);
        product.setCategory(this.category);
        System.out.println("dfskddddddddddddddddddddddddddddddddddddddd");
        return product;
    }
}
