package com.gurusader.designpatterns.builder;

public class Director {
	private GuitarBuilder guitarBuilder;

	public Director(GuitarBuilder guitarBuilder) {
		this.guitarBuilder = guitarBuilder;
	}

	public void setGuitarBuilder(GuitarBuilder guitarBuilder) {
		this.guitarBuilder = guitarBuilder;
	}

	public void makeGuitar() {
		guitarBuilder.buildNeck();
		guitarBuilder.buildFingerBoard();
		guitarBuilder.buildBody();
		guitarBuilder.buildPickup();
	}

	public Guitar getGuitar() {
		return guitarBuilder.getGuitar();
	}
}
