package com.example.md3finalexam.repositories;

import com.example.md3finalexam.models.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
}
