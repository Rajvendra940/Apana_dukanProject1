package com.product.ApnaDukan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.product.ApnaDukan.entity.Product;
import com.product.ApnaDukan.repository.ProductOderRepository;

import java.util.List;

@Service
public class ProductService {

	private final RestTemplate restTemplate;
	
	@Autowired
	public ProductService(RestTemplate restTemplate) {
		
		this.restTemplate=restTemplate;
	}

	  public String postDataToAnotherService(String url, Object requestBody) {
	        // Making a synchronous POST request
	        return restTemplate.postForObject(url, requestBody, String.class);
	    }
		@Autowired
	private ProductOderRepository productOderRepository;

	public Product saveProduct(Product product) {

		return productOderRepository.save(product);
	}

	public List <Product> findProduct(){
		return  productOderRepository.findAll();

	}
	

}
