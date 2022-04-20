package ejercicio6_tp2;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		int valornota=1;
		while(valornota > 0 && valornota <=10) {
			Scanner numero = new Scanner (System.in);
			System.out.println("ingrese valor(para salir ingrese 0) :");
			valornota = numero.nextInt();
			if(valornota ==6 ){
				System.out.println("Alumno regularizado");
			}
			if(valornota>=7 && valornota <=10){
				System.out.println("El alumno promociona");
			}
			if(valornota<6 && valornota >=1){
				System.out.println("El alumno desaprueba");
			}
			if(valornota<=0){
				System.out.println("Valor no permitido");
			}
		}
	}
}
