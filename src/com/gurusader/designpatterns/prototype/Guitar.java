package com.gurusader.designpatterns.prototype;

public class Guitar implements MusicalInstrument {
	private int numOfStrings;

	public Guitar(int numOfStrings) {
		this.numOfStrings = numOfStrings;
	}

	@Override
	public void play() {
		System.out.println("Play with " + numOfStrings + " strings.");
	}

	@Override
	public MusicalInstrument createClone() {
		MusicalInstrument musicalInstrument = null;

		try {
			musicalInstrument = (MusicalInstrument) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return musicalInstrument;
	}
}
