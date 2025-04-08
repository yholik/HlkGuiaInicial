package guiainicial.ejercicios.persona;
import java.util.Scanner;

/*Ingresar por teclado dos personas con nombre y edad. Mostrar quién es
mayor.*/
public class Main {
	public static void main(String[] args) {
		//TODO Transform in array Persona 
		
		
		Scanner sc = new Scanner(System.in);
		
		//MODIFICAR ESTA CONSTANTE SEGUN EL AÑO EN QUE ESTAMOS
		final int anio = 2025;
		
		System.out.println("¡Bienvenido!");
		System.out.println("¿Cual es tu nombre?");
		
		//CREACION DE OBJETO
		Persona persona1 = new Persona();
		
		//INGRESO DE NOMBRE
		persona1.nombre = sc.next();
		
		//INGRESO APELLIDO
		System.out.println("¿Y tu apellido?");
		persona1.apellido = sc.next();
		
		//CONSULTA EDAD
		System.out.println("Si me decis que año naciste, te digo cuantos años tenes: ¿Si o No?");
		String respuesta = sc.next();
		
		//SI RESPONDE SI, PIDE AÑO
		if(respuesta.equalsIgnoreCase("si")){
			System.out.println("Ingresa tu año");
			persona1.fechaDeNacimiento = sc.nextInt();
			
			//PREGUNTA SI YA CUMPLIO
			System.out.println("¿Ya cumpliste años?");
			respuesta = sc.next();
			if(respuesta.equalsIgnoreCase("si")) {
				
				//RESTAMOS AÑO CORRIENTE CON AÑO DE NACIMIENTO
				int calculo = anio - persona1.fechaDeNacimiento;
				System.out.println("Tu edad es: " + calculo);
			}else {
				//SI NO CUMPLIO AÑOS
				int calculo = (anio - persona1.fechaDeNacimiento) - 1;
				persona1.edad = calculo;
				System.out.println("Tu edad es: " + calculo);
			}
		
		}
		//FIN DE CONSULTA EDAD
		
		//CREACION DE SEGUNDO OBJETO
		Persona persona2 = new Persona();
		
		//NOMBRE Y APELLIDO OBJETO 2
		System.out.println("¿Nombre de la segunda persona?");
		persona2.nombre = sc.next();
		System.out.println("¿Apellido?");
		persona2.apellido = sc.next();
		
		//CONSULTA EDAD OBJETO 2
				System.out.println("Si me decis que año naciste, te digo cuantos años tenes: ¿Si o No?");
				respuesta = sc.next();
				
				//SI RESPONDE SI, PIDE AÑO
				if(respuesta.equalsIgnoreCase("si")){
					System.out.println("Ingresa tu año");
					persona2.fechaDeNacimiento = sc.nextInt();
					
					//PREGUNTA SI YA CUMPLIO
					System.out.println("¿Ya cumpliste años?");
					String respuesta2 = sc.next();
					if(respuesta2.equalsIgnoreCase("si")) {
						
						//RESTAMOS AÑO CORRIENTE CON AÑO DE NACIMIENTO
						int edad = anio - persona2.fechaDeNacimiento;
						persona2.edad = edad;
						System.out.println("Tu edad es: " + edad);
					}else {
						//SI NO CUMPLIO AÑOS
						int edad = (anio - persona2.fechaDeNacimiento) - 1;
						System.out.println("Tu edad es: " + edad);
						persona2.edad = edad;
					}
				
				}
				//FIN DE CONSULTA EDAD
				
			if(persona1.fechaDeNacimiento > persona2.fechaDeNacimiento) {
				System.out.println("El mayor es: " + persona2.nombre);
			}else {
				System.out.println(("El mayor es: " + persona1.nombre));
			}
		
		sc.close();
	}

}

