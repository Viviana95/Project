package com.finalproject.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.backend.models.Product;
import com.finalproject.backend.services.ProductService;

@RestController//establecer punto de entrada a la apirest, devuelve json
@RequestMapping(path = "/api/")//template de la ruta
public class ProductController {

  @Autowired
  ProductService productService;

  @GetMapping(value = "/products")
  public List<Product> getAll() {
    return productService.getAll(); //service que devuelva
  }

  @PostMapping(value = "/products")
  public Product store(@RequestBody  Product add) {
    Product product = productService.store(add);    
    return product;
    
  }
   
    
}
