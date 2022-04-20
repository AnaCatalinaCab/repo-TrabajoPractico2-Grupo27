package Punto8;

public class Punto8 {

	public static void main(String[] args) {
		int num = 1;
		System.out.println("Numeros multiplos de 4 menores de 100");
		do {
			if(num % 4 == 0) {
				System.out.println("Es multiplo: " + num);
			}
			num++;
		}while(num < 100);
			System.out.println("El numero es: " + num);
	}

}
