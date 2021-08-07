package com.example.practicecsw.service;

import com.example.practicecsw.dao.ProductRepository;
import com.example.practicecsw.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService{

    private ProductRepository repository;

    @Autowired
    public ProductServiceImp(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = repository.findAll();
        return products;
    }

    @Override
    public Product save(Product theProduct) {
        repository.save(theProduct);
        return theProduct;
    }

    @Override
    public Product buy(int productId, int quantity) {
        Optional<Product> product = repository.findById(productId);
        Product newProduct = new Product();
        return  product
                .map(pro -> {
                    pro.setName(newProduct.getName());
                    pro.setPrice(newProduct.getPrice());
                    pro.setQuantity(newProduct.getQuantity() + quantity);
                    return repository.save(pro);
                })
                .orElseGet(() -> {
                    newProduct.setId(productId);
                    return repository.save(newProduct);
                });
    }


}
