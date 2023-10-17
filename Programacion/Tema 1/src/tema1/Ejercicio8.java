package tema1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio8 {

	public static void main(String[] args) {
		//Establecemos variables
		double inf; //En esta variable guardaremos el valor para los billetes infantiles
		double adult; //En esta variable guardaremos el valor para los billetes adultos
		double desc; //En esta variable guardaremos el valor para el descuento
		double precio; //En esta variable guardaremos el valor para el precio final
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca los billetes infantiles
		System.out.print("Introduzca cuantas entradas infantiles desea: ");
		inf = sc.nextDouble(); //Se lee el valor en su variable correspondiente
		//Se le pide al usuario que introduzca los billetes de adultos
		System.out.print("Introduzca cuantas entradas de adulto desea: ");
		adult = sc.nextDouble(); //Se lee el valor en su variable correspondiente
		
		inf *= 15.50; //Las entradas infantiles se multiplican y asignan por su precio
		adult *= 20; //Las entradas adultas se multiplican y asignan por su precio
		desc = (inf + adult) * 0.05; //El descuento es la suma del precio por 5%
		precio = inf + adult > 100 ? (inf + adult) - desc : inf + adult; /*Con un operador ternario se establece el 
		precio final dependiendo del total*/
		
		System.out.println("El precio final es :" + precio); //Se devuelve al usuario el precio final
		
		sc.close(); //Se cierra el objeto Scanner

	}

}
