package com.gurusader.designpatterns.factorymethod;

import java.util.ArrayList;

public class TestFactoryMethodPattern {
	public static void main(String[] args) {
		ProductFactory productFactory = new ComputerFactory();

		ArrayList<Product> products = new ArrayList<>();
		products.add(productFactory.create("James"));
		products.add(productFactory.create("Kirk"));
		products.add(productFactory.create("Robert"));
		products.add(productFactory.create("Lars"));

		for (Product product : products) {
			product.use();
		}
	}
}
