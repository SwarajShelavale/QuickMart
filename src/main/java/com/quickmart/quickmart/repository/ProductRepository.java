package com.quickmart.quickmart.repository;

import com.quickmart.quickmart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Long> {

}
