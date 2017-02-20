package com.gurusader.designpatterns.builder;

public class GibsonGuitarBuilder implements GuitarBuilder {
	private Guitar guitar;

	public GibsonGuitarBuilder() {
		guitar = new Guitar();
	}

	@Override
	public void buildNeck() {
		guitar.setNeck("Mahogany neck");
	}

	@Override
	public void buildFingerBoard() {
		guitar.setFingerBoard("Ebony finger board");
	}

	@Override
	public void buildBody() {
		guitar.setBody("Mahogany body");
	}

	@Override
	public void buildPickup() {
		guitar.setPickup("HH");
	}

	@Override
	public Guitar getGuitar() {
		return guitar;
	}
}
