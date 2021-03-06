package com.gurusader.designpatterns.templatemethod;

public class TouchScreenPhone extends AbstractPhone {
	@Override
	public void makeCall() {
		System.out.println("Touch number and call button on screen keypad.");
	}

	@Override
	public void hangUpCall() {
		System.out.println("Touch end call button on screen keypad.");
	}
}
