package tema1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio9 {

	public static void main(String[] args) {
		//Establecemos variables
		int num1; //En esta variable guardaremos el valor para el primero numero
		int num2; //En esta variable guardaremos el valor para el primero numero
		String msg; //En esta variable guardaremos el mensaje para el resultado
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca un número
		System.out.print("Introduzca un numero: ");
		num1 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		//Se le pide al usuario que introduzca otro número
		System.out.print("Introduzca otro numero: ");
		num2 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		//Si el primero y el segundo numero son iguales devuelve un comentario, si son diferentes, otro.
		msg = num1 == num2 ? "Los numeros son iguales." : "Los numeros son diferentes.";
		
		System.out.print(msg); //Se devuelve al usuario el mensaje con el resultado
		
		sc.close(); //Se cierra el objeto Scanner


	}

}
