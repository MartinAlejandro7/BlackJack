package com.krakedev.juegos.servios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	
	private ArrayList<Jugador> jugadores;
	
	private Dealer dealer;
	
	public void cargarValores() {
		for(int i = 0; i < dealer.naipe.size(); i++) {
			 Carta val= dealer.naipe.get(i);
			 
			 String carta = val.getValor();
			 
			 if(carta.equals("A")) {
				 val.setValorJuego(11);
			 }else if(carta.equals("J") || carta.equals("Q")|| carta.equals("k")) {
				 val.setValorJuego(10);
			 }else {
				 val.setValorJuego(Integer.parseInt(carta));
			 }
		}
	}
	
	public void inicializar() {
		dealer = new Dealer();
		cargarValores();
		
		
	}
	
	public void agregarJugador(Jugador jugador){
		
		jugadores.add(jugador);
	}
	
	
}
