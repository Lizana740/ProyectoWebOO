package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cancha;

@Repository
public interface CanchaRepository extends JpaRepository<Cancha, Integer> {

}
