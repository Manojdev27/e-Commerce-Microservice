package com.hogwarts.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hogwarts.orderservice.dto.InventoryDTO;

@FeignClient(name = "inventory-service")
public interface InventoryClient {

    @GetMapping("/api/v1/inventory/{productId}")
    InventoryDTO getInventoryByProductId(@PathVariable Long productId);

    @PutMapping("/api/v1/inventory/update")
    void updateInventory(@RequestBody InventoryDTO inventoryDTO);
}
