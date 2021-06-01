package com.curso.cursojavaspring.repositories;

import com.curso.cursojavaspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
