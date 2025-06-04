package com.jitendra.productservice.controller;

import com.jitendra.productservice.model.Product;
import com.jitendra.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addOrUpdate")
    public Product addOrUpdateProduct(@RequestBody Product product) {
        return productService.addOrUpdateProduct(product);
    }
    
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
