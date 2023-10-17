package boletin1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio5 {
	
		public static void main(String[] args) {
			//Establecemos variables
			int num1; //En esta variable guardaremos el valor para el primero numero
			int num2; //En esta variable guardaremos el valor para el segundo numero
			int num3; //En esta variable guardaremos el valor para el tercer numero
			
			Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
			
			System.out.print("Introduzca un numero "); //Se le pide al usuario que introduzca un número
			num1 = sc.nextInt(); //Se lee el valor en su variable correspondiente
			System.out.print("introduzca otro numero "); //Se le pide al usuario que introduzca otro número
			num2 = sc.nextInt(); //Se lee el valor en su variable correspondiente
			System.out.print("Introduzca un numero mas  "); //Se le pide al usuario que introduzca otro número
			num3 = sc.nextInt(); //Se lee el valor en su variable correspondiente
			
			/*Con una condicional ordenamos los numeros
			mediante mayor que y else if se le ofrece al usuario los numeros ordenados*/
			if (num1 > num2 && num2 > num3) {
				System.out.println(num1+ ">" +num2+">"+num3);
			} else if (num1 > num3 && num3 > num2) {
				System.out.println(num1+ ">" +num3+">"+num2);
			} else if (num2 > num1 && num1 > num3) {
				System.out.println(num2+ ">" +num1+">"+num3);
			} else if (num2 > num3 && num2 > num1) {
				System.out.println(num2+ ">" +num3+">"+num1);
			} else if (num3 > num1 && num1 > num2) {
				System.out.println(num3+ ">" +num1+">"+num2);
			} else if (num3 > num2 && num2 > num1) {
				System.out.println(num3+ ">" +num2+">"+num1);	
			}
				
			sc.close(); //Se cierra el objeto Scanner
	} 
}
