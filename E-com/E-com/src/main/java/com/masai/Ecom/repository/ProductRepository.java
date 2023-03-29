package com.masai.Ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Ecom.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
