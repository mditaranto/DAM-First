package boletin1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double num; //En esta variable guardaremos el valor para el numero introducido
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		System.out.println("Introduzca un numero: "); //Se le pide al usuario que introduzca un número
		num = sc.nextDouble(); //Se lee el valor en su variable correspondiente
		
		//Calculamos si es casi-cero con una condicional
		if (num < 1 && num > -1 && num != 0) { //Si el numero cumple las condiciones entonces: 
			System.out.println("El numero es casi-cero.");
		} else { //Si no:
			System.out.println("El numero no es casi-cero. ");
		}
		
		sc.close(); //Se cierra el objeto Scanner

	}
}
