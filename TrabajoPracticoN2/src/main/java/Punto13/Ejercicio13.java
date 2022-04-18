package Punto13;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
	
		Empleado empleadoConstructor = new Empleado();
		
		Scanner leer = new Scanner(System.in);
			System.out.println("Ingrese nombre completo: ");
			empleadoConstructor.setNombre((String) leer.nextLine());
			
		Scanner leer1 = new Scanner(System.in);
			System.out.println("Ingrese el legajo: ");
			empleadoConstructor.setLegajo((int) leer1.nextDouble());
			
		Scanner leer2 = new Scanner(System.in);
			System.out.println("Ingrese el email: ");
			empleadoConstructor.setEmail((String) leer2.next());
			
		Scanner leer3 = new Scanner(System.in);
			System.out.println("Ingrese las horas de trabajo: ");
			empleadoConstructor.setHorasTrabajadas((int) leer3.nextDouble());
			
		empleadoConstructor.setFechaIngreso(LocalDate.of(2022, 1, 2));
			
			
			System.out.println(empleadoConstructor.toString());
			System.out.println("El sueldo final por hora es: " + empleadoConstructor.sueldoFinal());
	}
	
}
