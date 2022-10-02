package com.finalproject.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.backend.models.Product;
import com.finalproject.backend.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    
    public List<Product> getAll() {
        return repository.findAll();
    }
    public Product store(Product add) {
        return repository.save(add); //guarda el repositorio
    }
    
}
