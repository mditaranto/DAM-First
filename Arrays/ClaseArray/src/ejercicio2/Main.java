package ejercicio2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Crea un array de enteros de tamaño 10
		int[] numeros = new int[55];
		int a= 0;

		// Utilizamos Arrays.fill() para introducir los valores en el array
		for (int i = 1; i <= 10; i++) {
		  Arrays.fill(numeros, a, a + i , i);
		  a += i;
		}

		// Mostramos el array por pantalla
		System.out.println(Arrays.toString(numeros));
	}
}