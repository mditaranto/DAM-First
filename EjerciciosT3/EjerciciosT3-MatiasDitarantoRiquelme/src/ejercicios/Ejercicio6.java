package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Autor -> @mditaranto
	 * 
	 * Pruebras realizadas para la comprobacion de un correcto funcionamiento:
	 * 
	 * Numero introducido: 5 
	 * Respuesta esperada: (Formacion de una piramide denumeros) 
	 * Respuesta dada: (Formacion de una piramide de numeros)
	 * 
	 * Numero introducido: 0 
	 * Respuesta esperada: Se termina el programa 
	 * Respuestadada: Se termina el programa
	 * 
	 * Numero introducido: -5 
	 * Respuesta esperada: No ha introducido un valor entre 0 y 20 
	 * Respuesta dada: No ha introducido un valor entre 0 y 20
	 */

	public static void main(String[] args) {
		
		// Creamos la variable donde guardaremos los datos introduccidos
		int n;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

		// Se solicita al usuario que introduzca un numero
		System.out.println("Introduzca un valor entre 0 y 20");
		n = sc.nextInt(); // El numero es guardado en la variable

		// Si no esta entre los valores se termina el programa
		if (n <= 20 && n >= 0) {
			// Mediante un for establecemos una variable que crece hasta ser igual que el
			// numero introducido por el usuario
			for (int i = 1; i <= n; i++) {
				// Mientras la variable sea menor que el numero, se realiza otro for
				// En este for la variable creada crece hasta i y se muestra al usuario en cada
				// ciclo que realiza.
				for (int a = 1; a <= i; a++) {
					System.out.print(i);
				} // Añadimos un salto de linea
				System.out.println("");
			}
		} else {
			System.out.println("No ha introducido un valor entre 0 y 20");
		}
		sc.close(); // Cerramos el objeto Scanner
	}

}
