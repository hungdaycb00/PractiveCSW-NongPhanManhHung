package com.example.practicecsw.rest;

import com.example.practicecsw.entity.Product;
import com.example.practicecsw.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    private ProductService repository;

    public ProductRestController(ProductService repository) {
        this.repository = repository;
    }

    @GetMapping("/pro")
    List<Product> all() {
        return repository.findAll();
    }

    @PostMapping("/pro")
    Product newEmployee(@RequestBody Product newProduct) {
        return repository.save(newProduct);
    }

    @PutMapping("/pro/buy/{id}/{quantity}")
    Product buy(@PathVariable Integer id, @PathVariable Integer quantity) {

        return repository.buy(id,quantity);
    }
}
