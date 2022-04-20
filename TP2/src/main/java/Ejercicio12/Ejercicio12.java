package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		double h = 0;
		double t;
		double resultado = 0;
		double g = 9.81;
		System.out.println("Calculo de la caida de un objeto");
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la altura: ");
		h = leer.nextDouble();
		if( h != 0) {
			t = ((2*h)/g);
			resultado = Math.sqrt(t);
		}
		System.out.println("El resultado es: " + resultado);
	}
}
