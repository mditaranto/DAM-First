package boletin1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int num; //En esta variable guardaremos el valor para el numero introducido
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		System.out.print("Introduzca un numero: "); //Se le pide al usuario que introduzca un número
		num = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		/*Con una condicional definimos cuantas cifras tiene el numero 
		mediante menor que y else if*/
		if (num<10) {
			System.out.println("numero 1 cifras");
		} else if (num<99) {
			System.out.println("numero 2 cifras");
		} else if (num<999) {
			System.out.println("numero 3 cifras");
		} else if (num<9999) {
			System.out.println("numero 4 cifras");
		} else if (num<99999) {
			System.out.println("numero 5 cifras");
		} else {
			System.out.println("El numero tiene mas de 5 cifras");
		}
		
		sc.close(); //Se cierra el objeto Scanner
	}
}
