package com.codezone.codezonejpa.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codezone.codezonejpa.entity.Product;
import com.codezone.codezonejpa.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("/save")
	public String save(@RequestBody Product product) {
		System.out.println(product);
		return productService.save(product);
	}

	public String update(Product product) {
		System.out.println(product);
		return "deleted success..";
	}

	public String delete(Long id) {
		System.out.println(id);
		return "deleted success..";
	}

	public Product getAll(long id) {
		System.out.println();
		// list return
		return new Product();
	}

	public Product productGetById(long id) {
		System.out.println();
		return new Product();
	}

}
