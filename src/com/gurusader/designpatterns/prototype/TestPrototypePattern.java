package com.gurusader.designpatterns.prototype;

public class TestPrototypePattern {
	public static void main(String[] args) {
		MusicalInstrumentManager musicalInstrumentManager = MusicalInstrumentManager.getInstance();
		musicalInstrumentManager.register("Guitar", new Guitar(6));
		musicalInstrumentManager.register("Keyboard", new Keyboard(88));

		MusicalInstrument guitar = musicalInstrumentManager.getClone("Guitar");
		guitar.play();

		MusicalInstrument keyboard = musicalInstrumentManager.getClone("Keyboard");
		keyboard.play();
	}
}
