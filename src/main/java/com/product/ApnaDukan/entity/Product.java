package com.product.ApnaDukan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productName;
	private int qty;
	private Integer order_id;
	
	
	
	public Product() {
		super();
	}



	


	public Product(int id, String productName, int qty, Integer order_id) {
		super();
		this.id = id;
		this.productName = productName;
		this.qty = qty;
		this.order_id = order_id;
	}






	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}


		public Integer getOrder_id() {
		return order_id;
	}



	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", qty=" + qty + ", order_id=" + order_id + "]";
	}



	


	

}
