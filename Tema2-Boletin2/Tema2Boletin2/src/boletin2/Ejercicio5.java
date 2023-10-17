package boletin2;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String carnet; //En esta variable guardaremos la cadena para el carnet del usuario
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca su tipo de carnet
		System.out.println("Introduzca su carnet de conducir: ");
		System.out.println("[E], [D], [C1-C5], [A], [B1-B2] ");
		carnet = sc.next(); //Se lee el valor en su variable correspondiente
		
		//Mediante un switch ofrecemos un tipo de carnet segun el valor de la variable
		switch (carnet) {
			case "E" -> {
				System.out.println("Su carnet es de remolques");
			}
			case "D" -> {
				System.out.println("Su carnet es de autobuses");
			}
			case "C1", "C2", "C3", "C4", "C5" -> {
				System.out.println("Su carnet es de camiones");
			}
			case "A" -> {
				System.out.println("Su carnet es de motocicletas");
			}
			case "B1", "B2" -> {
				System.out.println("Su carnet es de automoviles");
			}
			default -> { /*En caso de introducir un valor que no este entre las opciones
				ofrecidas consideramos que es incorrecto*/
				System.out.println("Categoría no contemplada.");
			}
		}
		
		sc.close();  //Se cierra el objeto Scanner
	}

}
