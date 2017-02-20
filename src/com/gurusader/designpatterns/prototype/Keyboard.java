package com.gurusader.designpatterns.prototype;

public class Keyboard implements MusicalInstrument {
	private int numOfKeys;

	public Keyboard(int numOfKeys) {
		this.numOfKeys = numOfKeys;
	}

	@Override
	public void play() {
		System.out.println("Play with " + numOfKeys + " keys.");
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
