package ejercicio4_tp2;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		int num1;
		do {
			Scanner numero = new Scanner (System.in);
			System.out.println("ingrese numero(entre 1 y 12):");
			num1 = numero.nextInt();
			if(num1 >= 1 && num1 <= 12) {
				System.out.println("El numero ingresado corresponde a un mes del año");
			}
			if(num1 < 1 || num1 > 12){
				System.out.println("no existe este mes");
		}
		   }while(num1 >= 1 && num1 <= 12);

	}
}
