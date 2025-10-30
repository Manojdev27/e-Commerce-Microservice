package com.hogwarts.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hogwarts.orderservice.entity.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	

}
