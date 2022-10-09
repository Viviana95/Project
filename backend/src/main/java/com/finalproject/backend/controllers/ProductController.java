package com.finalproject.backend.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.backend.models.Product;
import com.finalproject.backend.services.ProductService;

@RestController//establecer punto de entrada a la apirest, devuelve json
@RequestMapping(path = "/api/")//template de la ruta
public class ProductController {

  @Autowired  //inyectar dependencia, es lo mismo que hace el constructor
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
  
  @DeleteMapping(path = "/products/{id}")  // variable de la url
  public Map<String, String> deleteProduct(@PathVariable Long id) {
   Map<String,String> message = productService.delete(id);
   return message;    
  }

  @PutMapping(path = "/products/{id}")
  public Product updateProduct(@PathVariable Long id, @RequestBody Product product){    
    return productService.update(id, product);
  }
  

    
}
