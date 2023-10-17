package ejercicio5;

import java.util.Scanner; //Importamos el objeto escaner

public class Ejercicio5 {

	public static void main(String[] args) {
		//Definimos variables
		float tri1;
		float tri2;
		float tri3;
		float media;
		// Creamos el objeto escaner a nombre de "sc"
		Scanner sc = new Scanner(System.in);
		
		// El programa pide y recoge los datos
		System.out.println("Introduzca sus notas del 1 trimestre ");
		tri1 = sc.nextFloat();
		System.out.println("Introduzca sus notas del 2 trimestre ");
		tri2 = sc.nextFloat();
		System.out.println("Introduzca sus notas del 3 trimestre ");
		tri3 = sc.nextFloat();
		
		//Se realizan operaciones necesarias
		media = (tri1+tri2+tri3)/3;
		//Se ofrecen 2 soluciones; 1 redondeada y una sin redondear
		System.out.println("Nota media del boletin: " + Math.round(media));
		System.out.println("Nota media del exp aca: " + media);
		
		sc.close();// Cerramos el objeto escaner
	}

}
