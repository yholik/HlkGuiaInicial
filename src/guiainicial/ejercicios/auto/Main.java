package guiainicial.ejercicios.auto;

import java.util.Scanner;

/*Ingresar por teclado dos autos con marca y velocidad. Mostrar cuál es
más rápido y cuánto tardaría cada uno en recorrer 100 km.*/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 //CREACION DE VECTOR DE OBJETOS DE TIPO AUTO
		 //MODIFICAR TAMAÑO UNICAMENTE 
		 Auto[] autos = new Auto[2];
		
		//MENSAJE DE LONGITUD DE VECTOR
		System.out.println("El largo del vector autos es " + autos.length);
		
		
		System.out.println("Bienvenido al sistema de autos");
		for (int i = 0; i < autos.length; i++) {
			autos[i] = new Auto();
			System.out.println("Nombre del auto " + (i + 1));
			autos[i].marca = sc.next();
			System.out.println("Velocidad del auto " + (i + 1));
			autos[i].velocidad = sc.nextInt();
			/*
			 * ATRIBUTOS: MODELOANIO, CONDICION, COLOR
			 * System.out.println("¿De que color es el auto " + (i+1) + "?"); 
			 * autos[i].color = sc.next(); 
			 * System.out.println("¿De que años es el auto " + (i+1) + "?");
			 * autos[i].modeloAnio = sc.nextInt(); 
			 * System.out.println("¿Es nuevo o viejo?");
			 * autos[i].condicion = sc.next();
			 */
		}

		// QUE AUTO ES MAS RAPIDO
		String masVelNombre = autos[0].marca;
		double masVelocidad = autos[0].velocidad;
		for (int i = 0; i < autos.length; i++) {
			if (autos[i].velocidad > masVelocidad) {
				masVelNombre = autos[i].marca;
				masVelocidad = autos[i].velocidad;
			}
		}
		System.out.println("El mas veloz es: " + masVelNombre);
		
		//CUANTO TARDA CADA UNO EN RECORRER 100KM
		for(int i = 0; i < 2; i++) {
			double totalHs = 0;
			double kms = 100;
			totalHs = kms / autos[i].velocidad;
			totalHs = totalHs * 60;
			System.out.println("El auto " + autos[i].marca + " tarda en recorrer 100 kms "
					+ " un total de " + totalHs + "min");
		}
		
		sc.close();
	}
}
