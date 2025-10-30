package com.hogwarts.productservice.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hogwarts.productservice.entity.Product;
import com.hogwarts.productservice.repository.ProductRepository;
import com.hogwarts.productservice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	

	@Override
	public Product addProduct(Product product) {
		
		return productRepository.save(product) ;
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProductById(Long id) {
		
		return productRepository.findById(id);
	}

}
