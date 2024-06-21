package com.codezone.codezonejpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codezone.codezonejpa.dao.ProductDao;
import com.codezone.codezonejpa.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;

	public String save(Product product) {
		dao.save(product);
		return "saved success...";
	}

}
