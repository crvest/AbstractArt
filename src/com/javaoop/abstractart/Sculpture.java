package com.javaoop.abstractart;

public class Sculpture extends Art {
	
	// member variables
	protected String material;

	@Override
	public void viewArt() {
		System.out.printf("Material: %s\nTitle: %s\nCreator: %s\nDescription: %s\n", material, title, author, description);
		System.out.print("------\n");
	}

	public Sculpture(String material, String title, String author, String description) {
		super(title, author, description);
		this.material = material;
	}
	
}
