package com.quickmart.quickmart.service;

import com.quickmart.quickmart.model.Category;
import com.quickmart.quickmart.model.Product;
import com.quickmart.quickmart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.quickmart.quickmart.model.Product;
import java.util.List;

public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
