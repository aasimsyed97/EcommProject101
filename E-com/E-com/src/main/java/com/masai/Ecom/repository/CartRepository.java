package com.masai.Ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Ecom.Model.Cart;
import com.masai.Ecom.Model.User;

public interface CartRepository extends JpaRepository<Cart, Integer>{

	 List<Cart> findAllByUserOrderByCreatedDateDesc(User user);
	
}
