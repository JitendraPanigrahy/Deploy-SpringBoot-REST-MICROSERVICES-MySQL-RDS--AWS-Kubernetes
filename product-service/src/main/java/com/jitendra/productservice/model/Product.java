package com.jitendra.productservice.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    
	@Column
    private String itemName;
    @Column
    private int quantityInStock;
    @Column
    private double price;

	private Long supplierId;
    
    public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
}