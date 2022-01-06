package com.sr.spring.service;

import com.sr.spring.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public Product saveProduct(Product product);
    public Product updateProduct(Product product);
    public Product softDelete(Product product);
    public Optional<Product> getProduct(long id);
    public List<Product> getProductList();
    public  void deleteProduct(long id);
}
