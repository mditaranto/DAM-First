package ejercicio3;

import java.util.Scanner; //Importamos el objeto escaner

public class Ejercicio3 {

	public static void main(String[] args) {
		//Definimos variables
		boolean par;
		int num;
		String msg;
		// Creamos el objeto escaner a nombre de "sc"
		Scanner sc = new Scanner(System.in);
		
		// El programa pide y recoge los datos
		System.out.println("Introduzca un num: ");
		num = sc.nextInt();
		
		//Se realizan operaciones necesarias
		par = num%2 == 0;
		//En caso de true o false se ofrece una respuesta u otra
		msg = par ? "Es par" : "Es impar";
		// Se le ofrece al usuario los resultados
		System.out.print("El numero es: " + msg);
		
		sc.close();// Cerramos el objeto escaner
		
	}

}
