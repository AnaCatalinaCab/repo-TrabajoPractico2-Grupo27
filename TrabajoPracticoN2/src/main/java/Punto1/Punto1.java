package Punto1;

import java.util.Scanner;

public class Punto1 {

	public static void main(String[] args) {
		double numero;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero para saber su factorial");
		numero = leer.nextDouble();
		double factorial = 1;
			while (numero != 0) {
				factorial = factorial * numero;
				numero --;
			}
			System.out.println("El resultado = " + factorial);
	}
}
