package ejercicio3_tp2;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		do {
			Scanner numero = new Scanner (System.in);
			System.out.println("ingrese numero(distinto de 0):");
			num1 = numero.nextInt();
			Scanner numero1 = new Scanner (System.in);
			System.out.println("ingrese numero(distinto de 0):");
			num2 = numero1.nextInt();
			Scanner numero2 = new Scanner (System.in);
			System.out.println("ingrese numero(distinto de 0):");
			num3 = numero2.nextInt();
			Scanner numero3 = new Scanner (System.in);
			System.out.println("ingrese numero(distinto de 0):");
			num4 = numero3.nextInt();
			Scanner numero4 = new Scanner (System.in);
			System.out.println("ingrese numero(distinto de 0):");
			num5 = numero4.nextInt();
			if(num1==0 || num2==0 || num3==0 || num4==0 || num5==0 ){
				System.out.println("ingrese de nuevo todos los valores:");
				}
		   }while( num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0 && num5 == 0);
			 if(num1 % 2 == 0 ){
				 System.out.println("el numero ingresado: " + num1 + " es par");
			 }else{
				 System.out.println("el numero ingresado: "+ num1 +" NO es par");
			 }  
			 if(num2 % 2 == 0 ){
				 System.out.println("el numero ingresado: "+ num2 + " es par");
			 }else{
				 System.out.println("el numero ingresado: "+ num2 +" NO es par");
			 }
			 if(num3 % 2 == 0 ){
				 System.out.println("el numero ingresado: "+ num3 +" es par");
			 }else{
				 System.out.println("el numero ingresado: "+ num3 +" NO es par");
			 }
			 if(num4 % 2 == 0 ){
				 System.out.println("el numero ingresado: "+ num4 +" es par");
			 }else{
				 System.out.println("el numero ingresado: "+ num4 +" NO es par");
			 }
			 if(num5 % 2 == 0 ){
				 System.out.println("el numero ingresado: "+ num5 +" es par");
			 }else{
				 System.out.println("el numero ingresado: "+ num5 +" NO es par");
			 }
	}
	
}
