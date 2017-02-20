package com.gurusader.designpatterns.builder;

public class FenderGuitarBuilder implements GuitarBuilder {
	private Guitar guitar;

	public FenderGuitarBuilder() {
		guitar = new Guitar();
	}

	@Override
	public void buildNeck() {
		guitar.setNeck("Maple neck");
	}

	@Override
	public void buildFingerBoard() {
		guitar.setFingerBoard("Rose wood finger board");
	}

	@Override
	public void buildBody() {
		guitar.setBody("Alder body");
	}

	@Override
	public void buildPickup() {
		guitar.setPickup("SSS");
	}

	@Override
	public Guitar getGuitar() {
		return guitar;
	}
}
