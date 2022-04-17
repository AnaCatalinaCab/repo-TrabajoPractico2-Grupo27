package ejercicio2_tp2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		double calculo;
		Scanner año = new Scanner (System.in);
		System.out.println("ingrese año a averiguar:");
		calculo = año.nextDouble();
		if((calculo % 4 == 0) && (calculo % 100 != 0)){
			System.out.println("es año Bisiesto");
			}if(calculo % 400 == 0){
				System.out.println("es año Bisiesto");
				}else{
					System.out.println("es un año comun :D");
					}
	}
	
}