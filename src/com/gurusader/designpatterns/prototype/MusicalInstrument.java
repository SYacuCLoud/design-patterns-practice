package com.gurusader.designpatterns.prototype;

public interface MusicalInstrument extends Cloneable {
	void play();
	MusicalInstrument createClone();
}
