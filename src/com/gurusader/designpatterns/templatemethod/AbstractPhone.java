package com.gurusader.designpatterns.templatemethod;

public abstract class AbstractPhone {
	public abstract void makeCall();
	public abstract void hangUpCall();

	public void call() {
		makeCall();
		System.out.println("Conversation");
		hangUpCall();
	}
}
