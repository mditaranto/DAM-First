package boletin1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio9 {

	public static void main(String[] args) {
		int jugada1; //En esta variable guardaremos el valor del jugador 1
		int jugada2; //En esta variable guardaremos el valor del jugador 2
		//Establecemos las constantes
		final int PIEDRA = 2;
		final int PAPEL = 3;
		final int TIJERAS = 1;
 		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		System.out.print("Introduzca: [1] tijeras [2] piedra [3] papel "); //Se le pide al usuario que introduzca un número
		jugada1 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		System.out.print("Introduzca: [1] tijeras [2] piedra [3] papel "); //Se le pide al usuario 2 que introduzca un número
		jugada2 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		//Se calcula el ganador con una condicional; en todos los casos que gana el jugador 1:
		if (jugada1 == PAPEL && jugada2 == PIEDRA || 
			jugada1 == TIJERAS && jugada2 == PAPEL || 
			jugada1 == PIEDRA && jugada2 == TIJERAS) {
			System.out.println("gana jugador 1");
		//Si no, es empate
		}  else if (jugada1 == jugada2) { 
			System.out.println("Empate");
		} else { //Y si no de ultima gana el jugador 2
			System.out.println("Gana jugador 2");
		}
		
		sc.close();//Se cierra el objeto Scanner

	}
}
