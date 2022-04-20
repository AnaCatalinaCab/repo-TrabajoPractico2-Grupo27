package Punto14;

import java.time.LocalDate;

import Punto13.Empleado;

public class Punto14 {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado("Lucas Andres Sanchez Rojas" , 3233 , 160);
		Empleado empleado3 = new Empleado("Lucas Andres Sanchez Rojas" , LocalDate.of(2022, 01, 02), 161);
		Empleado empleado4 = new Empleado("Lucas Andres Sanchez Rojas" , 159);
		
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println(empleado3.toString());
		System.out.println(empleado4.toString());
	}

}
