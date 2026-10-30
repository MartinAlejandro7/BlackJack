package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servios.Juego21;

public class TestJuego21 {

    public static void main(String[] args) {

        Juego21 juego = new Juego21();

        Jugador jugador1 = new Jugador();
        jugador1.setNickname("Jugador 1");

        Jugador jugador2 = new Jugador();
        jugador2.setNickname("Jugador 2");

        Jugador jugador3 = new Jugador();
        jugador3.setNickname("Jugador 3");

        juego.agregarJugador(jugador1);
        juego.agregarJugador(jugador2);
        juego.agregarJugador(jugador3);

        juego.inicializar();

        juego.repartirRonda();

        System.out.println("===== CARTAS DE LOS JUGADORES =====");

        jugador1.imprimir();
        jugador2.imprimir();
        jugador3.imprimir();

        System.out.println("\n===== CARTAS RESTANTES EN EL NAIPE =====");

        juego.getDealer().imprimirNaipe();
    }
}
