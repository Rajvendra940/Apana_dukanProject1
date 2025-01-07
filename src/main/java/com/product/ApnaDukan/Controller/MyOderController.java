package com.product.ApnaDukan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.ApnaDukan.entity.Product;
import com.product.ApnaDukan.service.ProductService;

@RestController
@RequestMapping("/product")
public class MyOderController {

	@GetMapping("/abc")
	public String getMessages() {
		return "My Product Testing";
	}

	@Autowired
	private ProductService productService;

	@PostMapping("/myproduct")
	public Product bookMyProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

}
