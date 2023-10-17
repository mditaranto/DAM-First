package tema1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio5 {

	public static void main(String[] args) {
		//Establecemos variables
		int a; //En esta variable guardaremos el valor para "a" introduccida por el usuario
		int b; //En esta variable guardaremos el valor para "b" introduccida por el usuario
		int c; //En esta variable guardaremos el valor para "c" introduccida por el usuario
		int x; //En esta variable guardaremos el valor para "x" introduccida por el usuario
		int y; //En esta variable guardaremos el resultado de la operacion
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca los datos y se leen en las variables
		System.out.print("Introduzca un valor para a: ");
		a = sc.nextInt();
		System.out.print("Introduzca un valor para b: ");
		b = sc.nextInt();
		System.out.print("Introduzca un valor para c: ");
		c = sc.nextInt();
		System.out.print("Introduzca un valor para x: ");
		x = sc.nextInt();
		
		//Se realiza la operacion de 2 grado
		y = a*(x*x)+(b*x)+c;
		
		System.out.println("El resultado de la operacion de 2º grado es: " + y); //Se devuelve al usuario los resultados de la operacion
		
		sc.close(); //Se cierra el objeto Scanner

	}

}
