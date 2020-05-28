package com.design.java.builder;

public class ProductBean {

	public static class Builder{

		public Builder() {
			
		}
		
		public ProductBean Product() {
			return new ProductBean(this);
		}
			
	}
	
	private String name;
	private String category;
	private String brand;
	private int price;
	
	ProductBean(Builder builder) {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
