package com.example.userdetailsapp.controller;

import com.example.userdetailsapp.model.ProductStyle;
import com.example.userdetailsapp.model.User;
import com.example.userdetailsapp.repository.ProductStyleRepository;
import com.example.userdetailsapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path="/")
public class ProductsController {

    @Autowired
    ProductStyleRepository productStyleRepository;

    @GetMapping(value = "/products")
    public List<ProductStyle> getProducts() {
        return productStyleRepository.findAll();
    }

    @PostMapping(value = "/product")
    public ProductStyle addUser(@RequestBody ProductStyle productStyle) {
        productStyleRepository.save(productStyle);
        return productStyle;
    }
}
