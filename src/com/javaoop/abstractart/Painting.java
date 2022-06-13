package com.javaoop.abstractart;

public class Painting extends Art {
	
	// member variables
	protected String paintType;

	@Override
	public void viewArt() {
		System.out.printf("Paint Type: %s\nTitle: %s\nCreator: %s\nDescription: %s\n", paintType, title, author, description);
		System.out.print("------\n");
	}

	public Painting(String paintType, String title, String author, String description) {
		super(title, author, description);
		this.paintType = paintType;
	}
	
}
