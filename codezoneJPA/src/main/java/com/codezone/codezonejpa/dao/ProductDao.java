package com.codezone.codezonejpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codezone.codezonejpa.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {

}
