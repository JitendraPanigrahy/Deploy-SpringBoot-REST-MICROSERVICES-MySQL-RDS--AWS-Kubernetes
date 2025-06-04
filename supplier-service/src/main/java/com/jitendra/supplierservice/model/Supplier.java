package com.jitendra.supplierservice.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

	@Column
    private String name;
    @Column
    private String contactInfo;
    @Column
    private String address;

	private List<Long> productIds;

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Long> getProductIds() {
		return productIds;
	}

	public void setProductIds(List<Long> productIds) {
		this.productIds = productIds;
	}


}