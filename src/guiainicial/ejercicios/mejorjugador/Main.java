package guiainicial.ejercicios.mejorjugador;

import java.util.Scanner;

/* Ingresar por teclado tres jugadores con nombre y puntaje. Mostrar el
puntaje total y quién hizo el mayor puntaje.*/
public class Main {

	public static void main(String[] args) {
		//SCANNER
		Scanner sc = new Scanner(System.in);

		System.out.println("Jugadores de la Liga");
		System.out.println("¿Quién tiene mejor puntuación?");
		
		//VECTOR DE TIPO JUGADOR, SOLO CAMBIAR TAMAÑO
		Jugador[] jugadores = new Jugador[3];
		
		//
		for(int i = 0; i < jugadores.length; i++) {
		System.out.println("Ingrese nombre del jugador " + (i+1));
		jugadores[i] = new Jugador();
		jugadores[i].nombre = sc.next();
		
		System.out.println("Ingrese puntaje del jugador " + (i+1));
		jugadores[i].puntaje = sc.nextDouble();
		}
		
		//VARIABLES PARA ALMACENAR EL MEJOR
		String elMejor = jugadores[0].nombre;
		double puntuacionMasAlta = jugadores[0].puntaje;
		
		for(int i = 0; i < jugadores.length; i++) {
			if(jugadores[i].puntaje > puntuacionMasAlta) {
				elMejor = jugadores[i].nombre;
				puntuacionMasAlta = jugadores[i].puntaje;
			}
		}
		
		System.out.println("El mejor jugador es: " + elMejor);
		
		sc.close();
	}

}
