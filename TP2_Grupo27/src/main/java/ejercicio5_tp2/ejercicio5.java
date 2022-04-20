package ejercicio5_tp2;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		int num1=0;
		int valor;
		Scanner seleccion = new Scanner(System.in);
		System.out.println("ingrese opcion 1 o 2");
		valor = seleccion.nextInt();
		while(valor >= 1 || valor <= 2){
			switch(valor){
			case 1:
				Scanner numero = new Scanner (System.in);
				System.out.println("ingrese numero(entre 1 y 12):");
				num1 = numero.nextInt();
				Scanner seleccion1 = new Scanner(System.in);
				System.out.println("ingrese opcion: ");
				valor = seleccion1.nextInt();
			    break;
			case 2:
			      if(num1 >= 1 && num1 <= 12){
			  	   System.out.println("El numero ingresado corresponde a un mes del año");
			      }else{
				  System.out.println("no existe este mes");
			      }
				  Scanner seleccion3 = new Scanner(System.in);
				  System.out.println("ingrese opcion: ");
				  valor = seleccion3.nextInt();
			    break;
			    default:
			    	System.out.println("adios");}
	  }

	}
}
