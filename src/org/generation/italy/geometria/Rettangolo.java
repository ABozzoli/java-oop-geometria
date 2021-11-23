package org.generation.italy.geometria;

public class Rettangolo {

	// attributi
	int base;
	int altezza;
	
	// costruttori
	Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	// metodi
	void calcolaArea() {
		int area = base * altezza;
		System.out.println("Area: " + area);
	}
	
	void calcolaPerimetro() {
		int perimetro = base * 2 + altezza *2;
		System.out.println("Perimetro: " + perimetro);
	}
	
}
