package com.gurusader.designpatterns.factorymethod;

public abstract class ProductFactory {
	protected abstract Product createProduct(String owner);

	public final Product create(String owner) {
		return createProduct(owner);
	}
}
