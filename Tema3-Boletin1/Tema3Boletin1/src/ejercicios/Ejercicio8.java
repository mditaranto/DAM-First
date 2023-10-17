package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
	
		int alt, alto = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte las alturas de los arboles, se guardara el valor del mas alto");
		System.out.println("para dejar de introducir numero inserte uno negativo.");
		alt = sc.nextInt();
		
		while (alt>0) {
			if (alt>alto) {
				alto = alt;
			}
			alt = sc.nextInt();
		}
		System.out.println("El arbol mas alto mide " + alto + " centimetros");
		sc.close();
	}

}
