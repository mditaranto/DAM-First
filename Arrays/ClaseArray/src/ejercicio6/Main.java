package ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creamos un array de tamaño 1000
		int[] array = new int[1000];

		// Creamos un objeto de la clase Scanner para leer valores desde el teclado
		Scanner sca = new Scanner(System.in);

		// Rellenamos el array con valores aleatorios entre 0 y 99
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		// Pedimos al usuario que ingrese un valor N
		System.out.print("Ingresa un valor N: ");
		int n = sca.nextInt();

		// Realizamos una búsqueda secuencial en el array para ver si el valor N existe
		// en el array
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				contador++;
			}
		}

		// Mostramos el resultado por pantalla
		if (contador > 0) {
			System.out.println("El valor " + n + " existe en el array y se encuentra " + contador + " veces");
		} else {
			System.out.println("El valor " + n + " no existe en el array");
		}
		
		sca.close();
	}
}