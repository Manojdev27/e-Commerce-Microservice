package com.hogwarts.inventoryservice.entity.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hogwarts.inventoryservice.entity.dto.ProductDto;

@FeignClient(name = "product-service")
public interface ProductClient {

	@GetMapping("/api/v1/products/{id}")
	ProductDto getProductById(@PathVariable Long id);
	
}
