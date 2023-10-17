package tema1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio4 {

	public static void main(String[] args) {
		//Establecemos variables
		float base; //En esta variable guardaremos la base introduccida por el usuario
		float alt; //En esta variable guardaremos la altura introduccida por el usuario
		double area; //En esta variable guardaremos el valor de la operacion (el area)
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca la base
		System.out.print("Introduzca una base para el triangulo: ");
		base = sc.nextFloat(); //Se lee el numero del usuario en la variable
		//Se le pide al usuario que introduzca la altura
		System.out.print("Introduzca una altura "); 
		alt = sc.nextFloat(); //Se lee el numero del usuario en la variable
		
		area = (base*alt)/2; //el area del triangulo es base por altura entre dos
		
		//Se le ofrece al usuario los resultados
		System.out.println("El area del triangulo es: " + area);
		
		sc.close(); //Se cierra el objeto Scanner
		

	}

}
