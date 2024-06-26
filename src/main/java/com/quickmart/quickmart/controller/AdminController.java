package com.quickmart.quickmart.controller;


import com.quickmart.quickmart.model.Category;
import com.quickmart.quickmart.repository.ProductRepository;
import com.quickmart.quickmart.service.CategoryService;
import com.quickmart.quickmart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller

public class AdminController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;

    @GetMapping("/admin")
    public String adminHome() {
        return "adminHome";
    }

    @GetMapping("/admin/categories")
    public String getCategroy(Model model) {
        model.addAttribute("categories",categoryService.getAllCategory());
        return "categories";
    }

    @GetMapping("/admin/categories/add")
    public String getCategroyAdd(Model model) {
        model.addAttribute("category",new Category());
        return "categoriesAdd";
    }

    @PostMapping("/admin/categories/add")
    public String postCategroyAdd(@ModelAttribute("category") Category category) {
        categoryService.addCategory(category);
        return "redirect:/admin/categories";
    }

    @GetMapping("/admin/categories/delete/{id}")
    public String deleteCategory(@PathVariable int id)
    {
        categoryService.removeCategoryById(id);
        return "redirect:/admin/categories";
    }

    @GetMapping("/admin/categories/update/{id}")
    public String updateCategory(@PathVariable int id,Model model)
    {
        Optional<Category> category =  categoryService.getCategoryById(id);
        if(category.isPresent())
        {
            model.addAttribute("category",category.get());
            return "categoriesAdd";
        }
        else
        {
            //Temporary Change it afterwards
            return "categoriesAdd";
        }
    }


    //PRODUCT SECTION
    @GetMapping("/admin/products")
    public String deleteCat(Model model)
    {
        model.addAttribute("prouctService.");
        return "products";
    }

}
