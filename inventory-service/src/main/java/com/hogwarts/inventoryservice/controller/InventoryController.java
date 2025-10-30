package com.hogwarts.inventoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hogwarts.inventoryservice.entity.Inventory;
import com.hogwarts.inventoryservice.service.InventoryService;

@RestController
@RequestMapping("/api/v1/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/inventoryUpdate")
	public Inventory updateInventory(@RequestBody Inventory inventory) {
		return inventoryService.updateInventory(inventory);
	}
	@GetMapping("/{productId}")
	public Inventory getInventoryByProductId(@PathVariable Long productId) {
	    return inventoryService.getInventoryByProductId(productId);
	}
	@GetMapping("/getAllInventory")
	public List<Inventory> getAllInventory(){
		return inventoryService.getAllInventory();
	}

	 @PutMapping("/update")
	 public ResponseEntity<Void> inventoryUpdate(@RequestBody Inventory inventory) {
	        inventoryService.updateInventory(inventory);
	        return ResponseEntity.ok().build();
	    }
}
