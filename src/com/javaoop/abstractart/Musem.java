package com.javaoop.abstractart;

public class Musem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Painting painting1 = new Painting("oil", "Mona Lisa", "Leonardo da Vinci", "weird lady");
		Painting painting2 = new Painting("oil", "The Starry Night", "Vincent Van Gogh", "weird sky");
		Painting painting3 = new Painting("watercolor", "Cathedral of Llandaff", "Paul Sandby", "weird tower");
		
		Sculpture sculpture1 = new Sculpture("stone", "The Great Sphinx", "unknown", "weird lion person");
		Sculpture sculpture2 = new Sculpture("bronze", "Manneken Pis", "Hieronymus Duquesnoy the Elder", "weird peeing boy");

		painting1.viewArt();
		painting2.viewArt();
		painting3.viewArt();
		sculpture1.viewArt();
		sculpture2.viewArt();
	
	}

}