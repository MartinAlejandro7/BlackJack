package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	
	private String nickname;
	
	private ArrayList<Carta> cartas;
	
	
	public void recibirCarta(Carta entregar) {
		
		cartas.add(entregar);
	}
}
