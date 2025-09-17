package com.nie.csd.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nie.csd.services.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.nie.csd.models.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class ProductController {

   @Autowired
    private ProductService service;

    // Return a list of products
  @GetMapping("/products")
    public List<Products> getAllProducts() {
        return service.getAllProducts();
    }


    // get products by id
    @GetMapping("/products/{id}")
    public Products getByProductId(@PathVariable("id") String id) {
	 return service.getByProductId(id);
    //  To do Get Process
    }


    // add a product
@PostMapping("/products")
    public Products addProducts(@RequestBody Products product) {
        return service.addProducts(product);
    // to do post process
    }
    // update a product by id; else add a new product
    @PutMapping("/products/{id}")
    public Products updateProducts(@PathVariable("id") String id, @RequestBody Products product) {
        // Implementation for updating a product
        return service.updateProducts(id, product); // Placeholder return statement
    }

    // delete a product by id
    @DeleteMapping("/products/{id}")
    public void deleteProducts(@PathVariable String id) {

        service.deleteProducts(id);
    }



}