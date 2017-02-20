package com.gurusader.designpatterns.factorymethod;

public class Computer extends Product {
	public Computer(String owner) {
		super(owner);
	}

	@Override
	public void use() {
		System.out.println(owner + " is programming using this computer.");
	}
}
