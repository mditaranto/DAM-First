package boletin1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num; //En esta variable guardaremos el valor para el numero introducido
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner

		System.out.print("Introduzca un numero: "); //Se le pide al usuario que introduzca un número
		num = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		//Calculamos si es par con una condicional
		if (num%2 == 0) { //Si el resto del numero entre 2 es igual a cero entonces:
			System.out.println("El numero es par"); 
		} else { //Si no:
			System.out.println("El numero es impar");
		}
		
		sc.close(); //Se cierra el objeto Scanner
	}
}
