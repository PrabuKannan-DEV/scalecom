package com.example.scalerecomm.controllers;


import com.example.scalerecomm.dtos.CreateProductRequestDTO;
import com.example.scalerecomm.dtos.CreateProductResponseDTO;
import com.example.scalerecomm.models.Product;
import com.example.scalerecomm.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService){
        this.productService = productService;
    }

    @PostMapping("")
    public CreateProductResponseDTO createProduct(@RequestBody CreateProductRequestDTO createProductRequestDTO){
        Product product = productService.createProduct(createProductRequestDTO.toProduct());

        return CreateProductResponseDTO.fromProduct(product);
    }

    @GetMapping("")
    public Product getProducts(){
        return null;
    }
}
