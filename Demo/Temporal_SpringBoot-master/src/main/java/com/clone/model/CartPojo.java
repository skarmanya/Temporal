package com.clone.model;

public class CartPojo {

	String productName;
	String productId;
	String unitPrice;
	String quantity;
	

	
	
	
	public CartPojo() {
		this.productName = "";
		this.productId = "";
		this.unitPrice = "";
		this.quantity = "";
	}
	public CartPojo(String productName, String productId, String unitPrice, String quantity) {
		this.productName = productName;
		this.productId = productId;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	
}
