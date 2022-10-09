package com.finalproject.backend.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String,String> delete(Long id) {
        Map<String, String> message = new HashMap<>();
        if(repository.findById(id).isPresent()){
           repository.deleteById(id);
           message.put("message", "Eliminado correctamente");
           return message;
        }
        message.put("message", "Error al eliminar producto");
        return message;    
    }

    public Product update(Long id, Product modifyProduct) {
        return repository.findById(id)
        .map((product)->{ //scceder a sus atributos
            product.setTitle(modifyProduct.getTitle());
            product.setDescription(modifyProduct.getDescription());
            product.setPrice(modifyProduct.getPrice());
            product.setImage(modifyProduct.getImage());
            return repository.save(product);
        })
        .orElseGet(()->{
           return repository.save(modifyProduct);
        });      
    }    
}
