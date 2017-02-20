package com.gurusader.designpatterns.factorymethod;

public class Computer extends Product {
	Computer(String owner) {
		super(owner);
	}

	@Override
	public void use() {
		System.out.println(getOwner() + " is programming using this computer.");
	}
}
