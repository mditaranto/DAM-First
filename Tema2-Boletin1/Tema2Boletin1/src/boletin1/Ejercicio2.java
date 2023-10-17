package boletin1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio2 {

	public static void main(String[] args) {
		//Establecemos variables
		int num1; //En esta variable guardaremos el valor para el primero numero
		int num2; //En esta variable guardaremos el valor para el segundo numero
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca un número
		System.out.print("Introduzca un numero: ");
		num1 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		//Se le pide al usuario que introduzca otro número
		System.out.print("Introduzca otro numero: ");
		num2 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		//Calculamos si son iguales con una condicional
		if (num1 == num2) { //Si numero 1 y numero 2 son iguales entonces: 
			System.out.println("Los numeros introducidos son iguales"); //Son iguales
		} else { //Si no:
			System.out.println("Los numeros introducidos son diferentes");//Son diferentes
		
		sc.close(); //Se cierra el objeto Scanner

	}
}

	}

