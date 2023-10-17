package boletin2;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int nota; //En esta variable guardaremos el valor para la nota
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		System.out.print("Introduzca su nota obtenida: "); //Se le pide al usuario que introduzca un número
		nota = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		//Mediante un switch valoramos la nota del usuario
		switch (nota) {
			case 0, 1, 2, 3, 4 -> { //Si se comprende entre 0 y 4 es suspenso
				System.out.println("Suspensisimo");
			}
			case 5 -> { //Si es 5 es suficiente
				System.out.println("Suficiente");
			} 
			case 6 -> { //Si es 6 es bien
				System.out.println("bien");
			}
			case 7, 8 -> { //Si es 7 u 8 es notable
				System.out.println("Notable");
			}
			case 9, 10 -> { //Si es 9 o 10 es sobresaliente
				System.out.println("Sobresaliente");
			}
			default -> { /*En caso de introducir un valor que no este entre 0 y 10
						consideramos que la nota es incorrecta*/
				System.out.println("Nota incorrecta");
			}
		}
		
		sc.close(); //Se cierra el objeto Scanner
	}

}
