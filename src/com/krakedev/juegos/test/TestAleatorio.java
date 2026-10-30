package com.krakedev.juegos.test;

import com.krakedev.juegos.servios.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {
		
		Dealer d = new Dealer();
		
		boolean cero = false;
		boolean maximo = false;

		for (int i = 0; i < 100; i++) {

		    int aleatorio = d.generarAleatorio(100);

		    if (aleatorio < 0 || aleatorio > 100) {
		        System.out.println("Fuera del rango");
		    }

		    if (aleatorio == 0) {
		        cero = true;
		    }

		    if (aleatorio == 100) {
		        maximo = true;
		    }
		}

		System.out.println("Salio 0: " + cero);
		System.out.println("Salio 100: " + maximo);
	}

}
