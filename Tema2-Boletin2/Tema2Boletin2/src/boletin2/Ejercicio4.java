package boletin2;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String dado1; //En esta variable guardaremos la cadena para el primer lanzamiento
		String dado2; //En esta variable guardaremos la cadena para el segundo lanzamiento
		int dado1num = 0; /*En esta variable guardaremos el valor para 
		el primero dado segun la variable "dado1"*/
		int dado2num = 0; /*En esta variable guardaremos el valor para
		el primero dado segun la variable "dado1"*/
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner

		/*Se le pide al usuario que introduzca cuanto ha sacado en cada tirada y
		se lee en sus respectivas variables*/
		System.out.print("Tire un dado. ¿Cuanto ha sacado? ");
		dado1 = sc.next();
		System.out.print("Tire de nuevo. ¿Cuanto ha sacado? ");
		dado2 = sc.next();

		/*Mediante un switch dependiendo de la variable "dado1" asignamos un valor
		numero a la variable "dado1num"*/
		switch (dado1) {
			case "UNO" -> {
				dado1num = 1;
			}
			case "DOS" -> {
				dado1num = 2;
			}
			case "TRES" -> {
				dado1num = 3;
			}
			case "CUATRO" -> {
				dado1num = 4;
			}
			case "CINCO" -> {
				dado1num = 5;
			}
			case "SEIS" -> {
				dado1num = 6;
			}	
		}
		
		/*Mediante un switch dependiendo de la variable "dado2" asignamos un valor
		numero a la variable "dado2num"*/
		switch (dado2) {
			case "UNO" -> {
				dado2num = 1;
			}
			case "DOS" -> {
				dado2num = 2;
			}
			case "TRES" -> {
				dado2num = 3;
			}
			case "CUATRO" -> {
				dado2num = 4;
			}
			case "CINCO" -> {
				dado2num = 5;
			}
			case "SEIS" -> {
				dado2num = 6;
			}
		}
		
		//Se le ofrece al usuario la suma resultante
		System.out.println("La suma de las 2 tiradas es: " + (dado1num+dado2num));
		sc.close(); //Se cierra el objeto Scanner
	}

}
