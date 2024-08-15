package com.example.scalerecomm.services;

import com.example.scalerecomm.dtos.FakeStoreCreateProductRequestDTO;
import com.example.scalerecomm.dtos.FakeStoreCreateProductResponseDTO;
import com.example.scalerecomm.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Product createProduct(Product product){
        FakeStoreCreateProductRequestDTO requestDTO = new FakeStoreCreateProductRequestDTO();
        requestDTO.setTitle(product.getTitle());
        requestDTO.setDescription(product.getDescription());
        requestDTO.setCategory(product.getCategory());
        requestDTO.setPrice(product.getPrice());
        requestDTO.setImage(product.getImageUrl());

        FakeStoreCreateProductResponseDTO responseDTO = restTemplate.postForObject("https://fakestoreapi.com/products", requestDTO, FakeStoreCreateProductResponseDTO.class);

        Product product1 = new Product();
        product1.setTitle(responseDTO.getTitle());
        product1.setId(responseDTO.getId());
        product1.setDescription(responseDTO.getDescription());
        product1.setPrice(requestDTO.getPrice());
        product1.setCategory(responseDTO.getCategory());
        product1.setImageUrl(responseDTO.getImage());
        return product1;
    }

    @Override
    public Product getProduct(Long id){
        return null;
    }
}
