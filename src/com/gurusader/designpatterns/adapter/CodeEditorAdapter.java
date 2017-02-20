package com.gurusader.designpatterns.adapter;

public class CodeEditorAdapter extends TextEditor implements CodeEditor {
	@Override
	public void editCode() {
		editText();
		System.out.println("Highlight syntax");
	}
}
