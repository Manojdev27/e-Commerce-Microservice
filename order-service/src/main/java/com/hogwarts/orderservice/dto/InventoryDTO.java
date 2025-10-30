package com.hogwarts.orderservice.dto;

import lombok.Data;

@Data
public class InventoryDTO {
	private Long inventoryId;
	private Long productId;
	private String productName;
	private int quantity;
}
