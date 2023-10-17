package boletin1;


import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio4 {

	public static void main(String[] args) {
		//Establecemos variables
		int num1; //En esta variable guardaremos el valor para el primero numero
		int num2; //En esta variable guardaremos el valor para el segundo numero
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		System.out.print("Introduzca un numero: "); //Se le pide al usuario que introduzca un número
		num1 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		System.out.print("Introduzca otro numero: "); //Se le pide al usuario que introduzca otro número
		num2 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		//Ordenamos de mayor a menos con una condicional
		if (num1<num2) { //Si el numero 1 es menor que el numero 2 entonces:
			System.out.println(num2 + " > " + num1);
		} else { //Si no:
			System.out.println(num1 + " > " + num2);
		}
		
		sc.close(); //Se cierra el objeto Scanner
	}

}
