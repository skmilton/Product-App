package com.sr.spring.controller;

import com.sr.spring.model.Product;
import com.sr.spring.repository.ProductRepository;
import com.sr.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ProductController {
    @Autowired
   private ProductService productService;
    @Autowired
    ProductRepository productRepository;

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product){
        return this.productService.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return this.productService.getProductList();
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        return this.productService.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable long id){
        this.productService.deleteProduct(id);
    }

    @GetMapping("products/{status}")
    public List<Product> getActiveProduct(@PathVariable String status){
        return this.productRepository.getActiveProduct(status);
    }



}
