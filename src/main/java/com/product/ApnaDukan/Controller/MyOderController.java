package com.product.ApnaDukan.Controller;

import com.product.ApnaDukan.repository.ProductOderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.product.ApnaDukan.entity.Product;
import com.product.ApnaDukan.service.ProductService;

import java.util.List;
import java.util.Optional;

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

	@GetMapping("/getAllProduct")
	public List < Product> getProductOrder( ) {

		return productService.findProduct();
	}
}
