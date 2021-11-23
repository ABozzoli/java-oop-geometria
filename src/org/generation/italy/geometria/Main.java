package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Scanner init
		Scanner scan = new Scanner(System.in);
		
		// chiedi all'utente le misure
		System.out.print("Base: ");
		int baseUtente = scan.nextInt();
		
		System.out.print("Altezza: ");
		int altezzaUtente = scan.nextInt();
		
		// Rettangolo init
		Rettangolo rettangoloUtente = new Rettangolo(baseUtente, altezzaUtente);
		
		// calcola area e perimetro
		System.out.println("Area: " + rettangoloUtente.calcolaArea());
		
		System.out.println("Perimetro: " + rettangoloUtente.calcolaPerimetro());
		
		// Scanner close
		scan.close();
		
	}

}
