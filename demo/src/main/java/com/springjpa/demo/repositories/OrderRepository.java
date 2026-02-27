package com.springjpa.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.demo.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
