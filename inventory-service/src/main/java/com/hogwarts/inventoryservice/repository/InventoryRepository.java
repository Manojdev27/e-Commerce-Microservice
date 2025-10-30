package com.hogwarts.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hogwarts.inventoryservice.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{


}
