package com.krakedev.juegos.test;

import java.util.ArrayList;

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

        // PRIMERA PRUEBA
        juego.inicializar();

        ArrayList<Jugador> ganadores = juego.jugar();

        System.out.println("===== PRIMERA PRUEBA =====");

        for (int i = 0; i < ganadores.size(); i++) {
            Jugador ganador = ganadores.get(i);
            System.out.println("Ganador: " + ganador.getNickname());
            System.out.println("Puntaje: " + ganador.getPuntajeCartas());
        }

        // SEGUNDA PRUEBA: 10 PARTIDAS
        System.out.println("\n===== SEGUNDA PRUEBA =====");

        for (int i = 0; i < 10; i++) {
        	
            jugador1.getCartas().clear();
            jugador1.setPuntajeCartas(0);

            jugador2.getCartas().clear();
            jugador2.setPuntajeCartas(0);

            jugador3.getCartas().clear();
            jugador3.setPuntajeCartas(0);

            juego.inicializar();

            
            ganadores = juego.jugar();

            System.out.println("\nPartida: " + (i + 1));

            if (ganadores.size() > 0) {

                for (int a = 0; a < ganadores.size(); a++) {
                    Jugador ganador = ganadores.get(a);

                    System.out.println("Ganador: " + ganador.getNickname());
                    System.out.println("Puntaje: " + ganador.getPuntajeCartas());
                }

            } else {
                System.out.println("No hubo ganadores.");
            }
        }
    }
}