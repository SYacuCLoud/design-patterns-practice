package com.gurusader.designpatterns.singleton;

public class LazyHolderInitialization {
	private LazyHolderInitialization() {
	}

	private static class LazyHolder {
		private static final LazyHolderInitialization INSTANCE = new LazyHolderInitialization();
	}

	public static LazyHolderInitialization getInstance() {
		return LazyHolder.INSTANCE;
	}
}
