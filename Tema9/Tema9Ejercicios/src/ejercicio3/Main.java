package ejercicio3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		//Creacion de la colecion
		//TreeSet para tener los valores ordenados
		Set<String> numeros = new TreeSet<>();

		String palabra;

		Scanner sca = new Scanner(System.in);

		System.out.println("Inserte una palabra");
		palabra = sca.next();

		//Se piden palabras al usuario hasta que se introduzca "fin"
		do {
			numeros.add(palabra);
			System.out.println("Inserte una palabra");
			palabra = sca.next();
		} while (!(palabra.equals("fin")));

		//Se imprime la coleccion
		System.out.println(numeros);

	}

}
