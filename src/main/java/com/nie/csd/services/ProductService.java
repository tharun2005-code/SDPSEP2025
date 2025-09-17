package com.nie.csd.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nie.csd.repositories.ProductRepository;
import com.nie.csd.models.*;

@Service
public class ProductService {

 @Autowired
    private ProductRepository repository;

    public List<Products> getAllProducts() {
        return repository.findAll();
    }

    public Products getByProductId(String id) {
        return repository.findById(id).get();
    }

    public Products addProducts(Products product) {
        return repository.save(product);
    }

    // Update operation
    public Products updateProducts(String id, Products product) {
        Products exProduct = repository.findById(id).get();
        if(exProduct!=null){
        exProduct.setName(product.getName());
        exProduct.setDescription(product.getDescription());
        exProduct.setCategory(product.getCategory());
        exProduct.setTags(product.getTags());
        exProduct.setPrice(product.getPrice());
        exProduct.setStock(product.getStock());
        return repository.save(exProduct);
        
    }
         return repository.save(product);

    }


    // delete operation
    public void deleteProducts(String id) {
         Products exProduct = repository.findById(id).get();
         if(exProduct!=null){
        repository.deleteById(id);
        System.out.println("Product with id " + id + " deleted successfully.");
         }
         else{
            System.out.println("Product with id " + id + " not found.");
         }
        }
}