package ejercicio2;

import java.util.Scanner; //Importamos el objeto escaner

public class Ejercicio2 {

	public static void main(String[] args) {
		//Definimos variables
		Boolean edadm;
		int edad;
		String msg;
		Scanner sc = new Scanner(System.in); // Creamos el objeto escaner a nombre de "sc"
		
		// El programa pide y recoge los datos
		System.out.print("Introduzca su edad");
		edad = sc.nextInt();
		
		//Se realizan operaciones necesarias
		edadm = edad >= 18;
		//En caso de true o false se ofrece una respuesta u otra
		msg = edadm ? "Usted es mayor de edad." : "Usted es menor.";
		// Se le ofrece al usuario los resultados
		System.out.println(msg);
		
		sc.close();// Cerramos el objeto escaner
		
	}

}
