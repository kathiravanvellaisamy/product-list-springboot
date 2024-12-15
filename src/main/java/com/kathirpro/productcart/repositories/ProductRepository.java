package com.kathirpro.productcart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kathirpro.productcart.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
