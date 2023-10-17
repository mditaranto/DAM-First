package ejercicios;

import java.util.Scanner; //importamos el objeto Scanner

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos la variable donde guardaremos los datos introduccidos
		int num;
		// Creamos la variable donde guardaremos la suma total
		int suma = 0;
		
		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		// Se le pide al usuario que introduzca numeros y para finalizar uno negativo.
		System.out.println("A continuacion se sumaran todos los numeros introducidos"
				+ "para finalizar el programa inserte un numero negativo");
		num = sc.nextInt(); // El numero es guardado en la variable
		
		// Mientras el numero sea positivo
		while (num>=0) {
			suma += num; //Se sumara
			num = sc.nextInt(); //Y se volvera a pedir otro numero
		} //Una vez se deje de cumplir la condicion del while continua el programa
		
		//Ofrecemos al usuario la suma total
		System.out.println("La suma total de todos los numeros es: " + suma);

		sc.close(); // Cerramos el objeto Scanner
	}

}
