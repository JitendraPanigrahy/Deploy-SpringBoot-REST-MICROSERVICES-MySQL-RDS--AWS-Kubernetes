package com.jitendra.productservice.service;

import com.jitendra.productservice.model.Product;
import com.jitendra.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	 

    public Product addOrUpdateProduct(Product product) {
        return productRepository.save(product);
    }
    
    
}