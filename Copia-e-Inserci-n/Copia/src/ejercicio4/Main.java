package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tablaEnteros[] = new int[10];
		int copia[] = new int[10];

		Scanner sca = new Scanner(System.in);

		for (int i = tablaEnteros.length - 1; i >= 0; i--) {
			System.out.print("Introduzca un numero: ");
			tablaEnteros[i] = sca.nextInt();
		}
		
		
	}
}
