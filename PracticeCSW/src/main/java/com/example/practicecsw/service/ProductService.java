package com.example.practicecsw.service;

import com.example.practicecsw.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();

    public Product save(Product theProduct);

    public Product buy(int productId, int quantity);
}
