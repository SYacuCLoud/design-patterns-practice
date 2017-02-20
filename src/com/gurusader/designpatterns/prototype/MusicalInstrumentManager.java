package com.gurusader.designpatterns.prototype;

import java.util.Hashtable;

public class MusicalInstrumentManager {
	private Hashtable<String, MusicalInstrument> showcase;

	private MusicalInstrumentManager() {
		showcase = new Hashtable<>();
	}

	private static class LazyHolder {
		private static final MusicalInstrumentManager INSTANCE = new MusicalInstrumentManager();
	}

	public static MusicalInstrumentManager getInstance() {
		return LazyHolder.INSTANCE;
	}

	public void register(String name, MusicalInstrument musicalInstrument) {
		showcase.put(name, musicalInstrument);
	}

	public MusicalInstrument getClone(String name) {
		MusicalInstrument musicalInstrument = showcase.get(name);
		return musicalInstrument.createClone();
	}
}
