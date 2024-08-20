package com.example.product_rest_api_my_sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.product_rest_api_my_sql.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
