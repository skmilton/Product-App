package com.sr.spring.service;

import com.sr.spring.model.Product;
import com.sr.spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product) {

        return this.productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Product softDelete(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Optional<Product> getProduct(long id) {
        return this.productRepository.findById(id);
    }

    @Override
    public List<Product> getProductList() {
        return this.productRepository.findAll();
    }

    @Override
    public void deleteProduct(long id) {
        Product p = this.productRepository.getOne(id);
        this.productRepository.delete(p);
    }
}
