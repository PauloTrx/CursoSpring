package com.curso.cursojavaspring.repositories;

import com.curso.cursojavaspring.entities.Order;
import com.curso.cursojavaspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
