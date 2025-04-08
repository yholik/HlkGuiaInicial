package guiainicial.ejercicios.empleados;
import java.util.Scanner;

/* Ingresar por teclado tres empleados con nombre, horas trabajadas y
	pago por hora. Una vez hecho esto:
	• Calcular el sueldo total de cada uno (horas * pago).
	• Mostrar cuánto cobra cada uno.
	• Indicar quién ganó más.
	• Mostrar cuánto se pagó en total entre los tres
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empleado[] empleados = new Empleado[3];

		final double valorHora = 2500;
		for (int i = 0; i < empleados.length; i++) {
			empleados[i] = new Empleado();

			// NOMBRE DEL EMPLEADO
			System.out.println("Nombre del empleado " + (i + 1));
			empleados[i].nombre = sc.next();
			System.out.println("Apellido del empleado " + (i + 1));
			empleados[i].apellido = sc.next();

			// HS TRABAJADAS
			System.out.println("¿Cuantas horas trabaja?");
			empleados[i].horasTrabajadas = sc.nextDouble();
		}

		// VARIABLES PARA ALMACENAR QUIEN GANO MAS
		String mejorSueldoNombre = empleados[0].nombre;
		double mejorSueldoTotal = empleados[0].sueldo;
		double horasTrabajadas = empleados[0].horasTrabajadas;
		double sueldosTotales = 0;

		for (int i = 0; i < empleados.length; i++) {
			empleados[i].sueldo = 0;
			empleados[i].sueldo = empleados[i].horasTrabajadas * valorHora;
			
			//CALCULO SUELDOS TOTALES
			sueldosTotales = sueldosTotales + empleados[i].sueldo;
			
			// MOSTRAR CUANTO COBRA CADA UNO
			System.out.println("El empleado " + empleados[i].nombre + " " + empleados[i].apellido + " "
					+ "tiene un sueldo " + "total de " + empleados[i].sueldo);

			// CALCULAMOS EL MEJOR SUELDO BASANDONOS EN EL CALCULO DE HS TRABAJADAS
			if (empleados[i].sueldo > mejorSueldoTotal) {
				mejorSueldoNombre = empleados[i].nombre;
				mejorSueldoTotal = empleados[i].sueldo;
				horasTrabajadas = empleados[i].horasTrabajadas;
			}
		}
		
		//MOSTRAR QUIEN GANO MAS (TODO indicar cuantas hs hizo tambien sin utilizar variable).
		System.out.println("La persona que se esclavizo mas fue " + mejorSueldoNombre + " con un sueldo de " + mejorSueldoTotal
				+ " y un total de " + horasTrabajadas + "hs trabajadas");
	}

}
