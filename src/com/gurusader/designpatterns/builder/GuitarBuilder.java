package com.gurusader.designpatterns.builder;

public interface GuitarBuilder {
	void buildNeck();
	void buildFingerBoard();
	void buildBody();
	void buildPickup();
	Guitar getGuitar();
}
