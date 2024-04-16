package com.quickmart.quickmart.repository;

import com.quickmart.quickmart.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRespository extends JpaRepository<Category,Integer> {

}
