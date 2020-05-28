package com.design.java.builder;

public class ProductOrder {
	
	public static void main(String[] args) {
		ProductBean.Builder product = new ProductBean.Builder();
	
		
		ProductBean bean = product.Product();
		System.out.println(bean.getName());
		System.out.println(bean.getBrand());
		System.out.println(bean.getPrice());
	}
}
