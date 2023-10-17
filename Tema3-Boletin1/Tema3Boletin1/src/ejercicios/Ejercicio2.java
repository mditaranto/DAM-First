package ejercicios;

import java.util.Scanner; //importamos el objeto Scanner

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos la variable donde guardaremos los datos introduccidos
		int num;
		// Creamos la variable donde guardaremos la cuenta total
		int cont = 0;
		
		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		// Se le pide al usuario que introduzca numeros y para finalizar uno negativo.
		System.out.println("A continuacion se contaran todos los numeros introducidos"
				+ " para finalizar el programa inserte un numero negativo");
		num = sc.nextInt(); // El numero es guardado en la variable
		
		// Mientras el numero sea positivo
		while (num>=0) {
			cont++; //Se suma 1 a la cuenta
			num = sc.nextInt(); //Y se volvera a pedir otro numero
		}

		System.out.println("ha introducido: " + cont + " numeros");
		
		sc.close(); // Cerramos el objeto Scanner
	}

}
