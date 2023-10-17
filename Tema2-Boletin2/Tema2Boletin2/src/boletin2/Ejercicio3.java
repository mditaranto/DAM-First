package boletin2;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double num1; //En esta variable guardaremos el valor para el primer numero 
		double num2; //En esta variable guardaremos el valor para el segundo numero 
		String letra; //En esta variable guardaremos la cadena para la letra (Opciones)
 
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca dos numero
		System.out.print("Introduzca 2 numeros: ");
		//Se leen los valores en sus variables correspondientes
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//Se pide al usuario que elija que operacion realizar mediante una letra
		System.out.println("A. SUMAR LOS NÚMEROS.");
		System.out.println("B. RESTAR LOS NÚMEROS.");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS.");
		System.out.println("D. DIVIDIR LOS NÚMEROS.");
		letra = sc.next(); //Se lee la letra en la variable 
		
		//Mediante un switch realizamos la operacion segun la letra
		switch (letra) {
			case "A" -> {
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			}
			case "B" -> {
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			}
			case "C" -> {
				System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			}
			case "D" -> {
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			}
			default -> { /*En caso de introducir una letra que no sea A, B, C o D
				consideramos que la letra es incorrecta*/
				System.out.println("Por favor escoga una opcion correcta.");
			}
		}
		
		sc.close(); //Se cierra el objeto Scanner
	}

}
