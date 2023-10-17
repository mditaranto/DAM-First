package ejercicio1;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		//Creacion de la coleccion
		//TreeSet porque queremos los numeros ordenados
		Set<Integer> numeros = new TreeSet<>();
		
		//Mediante un for creamos numeros aleatorios
		for (int i = 0; i < 20; i++) {
			numeros.add((int)(Math.random()*100));
		}
		
		//Imprimimos la coleccion
		System.out.println(numeros);

	}

}
