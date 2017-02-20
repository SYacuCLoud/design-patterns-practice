package com.gurusader.designpatterns.factorymethod;

public abstract class Product {
	private String owner;

	Product(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public abstract void use();
}
