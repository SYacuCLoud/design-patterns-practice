package com.gurusader.designpatterns.factorymethod;

public class ComputerFactory extends ProductFactory {
	@Override
	protected Product createProduct(String owner) {
		return new Computer(owner);
	}
}
