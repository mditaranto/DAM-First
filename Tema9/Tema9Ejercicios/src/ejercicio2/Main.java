package ejercicio2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		//Creacion de la coleccion
		//LinkedHashSet porque queremos guardar el orden por insercion 
		Set<String> numeros = new LinkedHashSet<>();
		
		//Variable de la palabra
		String palabra;
		
		Scanner sca = new Scanner(System.in);
		
		//Se solicita al usuario una palabra
		System.out.println("Inserte una palabra");
		palabra = sca.next();
		
		//Se insertan palabras hasta que se introduzca "fin"
		do {
			numeros.add(palabra);
			System.out.println("Inserte una palabra");
			palabra = sca.next();
		} while (!(palabra.equals("fin")));
		
		//Se imprime la coleccion
		System.out.println(numeros);

	}

}
