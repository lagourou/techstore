package com.cwa.techstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cwa.techstore.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
