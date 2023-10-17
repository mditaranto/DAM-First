package boletin1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int nota; //En esta variable guardaremos el valor para la nota
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		System.out.print("Introduzca su nota obtenida: "); //Se le pide al usuario que introduzca un número
		nota = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		//Mediante un condicional le asignamos un valor a la nota del usuario
		if (nota<5) {
			System.out.println("Suspenso");
		} else if (nota == 5) {
			System.out.println("Suficiente");
		} else if (nota == 6) {
			System.out.println("bien");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Notable");
		} else if (nota == 9 || nota == 10) {
			System.out.println("Sobresaliente");
		} else { /*En caso de introducir un valor que no este entre 0 y 10
					consideramos que la nota es incorrecta*/
			System.out.println("Nota incorrecta");
		}
		
		sc.close(); //Se cierra el objeto Scanner
	}
}
