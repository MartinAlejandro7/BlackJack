package com.krakedev.juegos.servios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {

	private ArrayList<Jugador> jugadores;

	private Dealer dealer;

	
	public Juego21() {
	    jugadores = new ArrayList<Jugador>();
	}
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public void cargarValores() {
		for (int i = 0; i < dealer.naipe.size(); i++) {
			Carta val = dealer.naipe.get(i);

			String carta = val.getValor();

			if (carta.equals("A")) {
				val.setValorJuego(11);
			} else if (carta.equals("J") || carta.equals("Q") || carta.equals("K")) {
				val.setValorJuego(10);
			} else {
				val.setValorJuego(Integer.parseInt(carta));
			}
		}
	}

	public void inicializar() {
		dealer = new Dealer();
		cargarValores();

	}

	public void agregarJugador(Jugador jugador) {

		jugadores.add(jugador);
	}

	public void repartirCarta(Jugador jugador) {
		Carta carta = dealer.entregarCarta();
		jugador.recibirCarta(carta);
	}

	public void repartirRonda() {
		for (int i = 0; i < jugadores.size(); i++) {
			Jugador j = jugadores.get(i);
			repartirCarta(j);
		}
		
		calcularTotal();
	}
	
	public void calcularTotal() {
		
		for(int i = 0; i < jugadores.size(); i++) {
			Jugador j = jugadores.get(i);
			int total = 0;
			
			for(int a = 0 ; a < j.getCartas().size(); a++) {
				Carta n = j.getCartas().get(a);
				n.getValorJuego();
				total = total + n.getValorJuego();
				
			}
			j.setPuntajeCartas(total);
		}
	}
}
