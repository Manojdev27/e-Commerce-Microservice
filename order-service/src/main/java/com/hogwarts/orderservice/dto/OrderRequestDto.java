package com.hogwarts.orderservice.dto;

import lombok.Data;

@Data
public class OrderRequestDto {
	private String productName;
	private Long productId;
	private int quantity;
}
