package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuacion se dira si los numeros introducidos "
				+ "son par o no para finalizar el programa inserte un 0");
		
		num = sc.nextInt();
		
		while (num != 0) {
			if (num%2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
			num = sc.nextInt();
		}
		
		System.out.println("Cuando necesites saber si un numero es par, vuelve a mi :)");

	}

}
