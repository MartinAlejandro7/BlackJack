package com.krakedev.juegos.servios;

import java.util.ArrayList;
import com.krakedev.juegos.entidades.Carta;

public class Dealer {

	ArrayList<Carta> naipe;
	
	
	public Dealer() {
		
		naipe = new ArrayList<Carta>();
		generarNaipe();
		
	}

	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}

	public void generarNaipe() {

		naipe = new ArrayList<Carta>();

		ArrayList<String> palos = new ArrayList<String>();

		palos.add("T");
		palos.add("CN");
		palos.add("CR");
		palos.add("D");

		String[] valores = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		for (int i = 0; i < palos.size(); i++) {
			String palo = palos.get(i);

			for (int j = 0; j < valores.length; j++) {
				String val = valores[j];

				Carta carta = new Carta();

				carta.setPalo(palo);
				carta.setValor(val);

				naipe.add(carta);

			}

		}
	}
	
	 public void imprimirNaipe() {
		 for(Carta c: naipe) {
			 c.imprimir();
		 }
	 }
	 
	 public int generarAleatorio(int maximo) {
		int aleatorio = (int)(Math.random()*(maximo+1));
		return aleatorio;
	 }

}
