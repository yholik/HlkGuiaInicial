package guiainicial.ejercicios.producto;

import java.util.Scanner;

/*Ingresar por teclado tres productos con nombre y precio. Calcular el
precio total.*/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Producto[] productos= new Producto[3];	
		
		
		System.out.println("Bienvenido al sistema");
		
		//DATOS PRODUCTO 1
		for(int i = 0; i < 3; i++) {
		productos[i]= new Producto();
		System.out.println("Nombre del producto " + (i+1));
		productos[i].nombre = sc.next();
		System.out.println("Precio del producto " + (i+1) );
		productos[i].precio = sc.nextDouble();
		System.out.println("Codigo del producto" + (i+1));
		productos[i].codigo = sc.nextInt();
		System.out.println("Stock del producto" + (i+1));
		productos[i].stock = sc.nextInt();
		}		
		
		double precioTotal = 0;
		for(int i = 0; i < 3; i++) {
		precioTotal = precioTotal + productos[i].precio;
		}
		
		System.out.println("El precio total por los tres productos es " + "$" + precioTotal);
		
		
		sc.close();
	}

}
