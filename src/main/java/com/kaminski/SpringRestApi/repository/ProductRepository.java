package com.kaminski.SpringRestApi.repository;

import com.kaminski.SpringRestApi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
