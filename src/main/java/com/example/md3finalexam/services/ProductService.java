package com.example.md3finalexam.services;

import com.example.md3finalexam.models.Product;
import com.example.md3finalexam.repositories.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
