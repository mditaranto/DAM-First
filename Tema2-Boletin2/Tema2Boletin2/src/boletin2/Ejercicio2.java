package boletin2;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numdia; //En esta variable guardaremos el valor para el numero 
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca un número del 1 al 7
		System.out.print("Introduzca un numero del 1 al 7 ");
		numdia = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		//Mediante un switch ofrecemos un dia segun el numero
		switch (numdia) {
			case 1 -> {
				System.out.println("Es lunes");
			}
			case 2 -> {
				System.out.println("Es martes");
			}
			case 3 -> {
				System.out.println("Es miercoles");
			}
			case 4 -> {
				System.out.println("Es jueves");
			}
			case 5 -> {
				System.out.println("Es viernes");
			}
			case 6 -> {
				System.out.println("Es sabado");
			}
			case 7 -> {
				System.out.println("Es domingo");
			}
			default -> { /*En caso de introducir un valor que no este entre 1 y 7
				consideramos que el dia es incorrecto*/
				System.out.println("No es un numero valido");
			}
		}
		
		sc.close(); //Se cierra el objeto Scanner
	}

}
