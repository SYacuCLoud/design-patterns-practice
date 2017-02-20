package com.gurusader.designpatterns.builder;

public class TestBuilderPattern {
	public static void main(String[] args) {
		Director director = new Director(new FenderGuitarBuilder());
		director.makeGuitar();
		Guitar guitar = director.getGuitar();
		System.out.println(guitar);

		System.out.println("");

		director.setGuitarBuilder(new GibsonGuitarBuilder());
		director.makeGuitar();
		guitar = director.getGuitar();
		System.out.println(guitar);
	}
}
