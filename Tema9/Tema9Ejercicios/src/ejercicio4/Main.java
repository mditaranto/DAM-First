package ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Map<Integer, Integer> numeros = new HashMap<>();
		Map<Integer, Integer> estrellas = new HashMap<>();

		// Pedir al usuario que introduzca los números del Euromillón
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce los 5 números del Euromillón:");
		for (int i = 0; i < 5; i++) {
			int numero = scanner.nextInt();
			if (numeros.containsKey(numero)) {
				numeros.put(numero, numeros.get(numero) + 1);
			} else {
				numeros.put(numero, 1);
			}
		}

		// Pedir al usuario que introduzca las estrellas del Euromillón
		System.out.println("Introduce las 2 estrellas del Euromillón:");
		for (int i = 0; i < 2; i++) {
			int estrella = scanner.nextInt();
			if (estrellas.containsKey(estrella)) {
				estrellas.put(estrella, numeros.get(estrella) + 1);
			} else {
				numeros.put(estrella, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
			System.out.println("Número: " + entry.getKey() + " - Veces: " + entry.getValue());
		}

		for (Map.Entry<Integer, Integer> entry2 : estrellas.entrySet()) {
			System.out.println("Número: " + entry2.getKey() + " - Veces: " + entry2.getValue());
		}

	}

}
