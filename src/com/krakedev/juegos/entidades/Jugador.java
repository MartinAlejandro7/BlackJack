package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	
	private String nickname;
	
	private ArrayList<Carta> cartas;
	
	public Jugador() {
	    cartas = new ArrayList<Carta>();
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public void recibirCarta(Carta entregar) {
		
		cartas.add(entregar);
	}
	
	public void imprimir() {
		System.out.println("NickName Jugador: " + nickname);
		for(int i = 0; i< cartas.size(); i++) {
			Carta car = cartas.get(i);
			
			car.imprimir();
		
		}
	}
}
