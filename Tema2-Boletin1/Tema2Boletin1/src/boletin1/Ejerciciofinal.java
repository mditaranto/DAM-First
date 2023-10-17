package boletin1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejerciciofinal {

	public static void main(String[] args) {
		//En estas variables guardaremos el valor de los 3 numeros introducidos
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		System.out.print("introduzca un numero entero: "); //Se le pide al usuario que introduzca un número
		num1 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		System.out.print("introduzca un otro numero entero: "); //Se le pide al usuario que introduzca otro número
		num2 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		System.out.print("introduzca un numero entero mas : "); //Se le pide al usuario que introduzca otro número
		num3 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		//Con una condicional se calcula si hay sumas posibles que den como resultado otro
		if (num1 + num2 == num3) {
			System.out.println("La suma de " + num1 + " y " + num2 + " da como resultado: " + num3);
		} else if (num1 + num3 == num2) {
			System.out.println("La suma de " + num1 + " y " + num3 + " da como resultado: " + num2);
		} else if (num2 + num3 == num1) {
			System.out.println("La suma de " + num2 + " y " + num3 + " da como resultado: " + num1);
		} else { //En caso de que no la haya, se dice al usuario
			System.out.println("No hay suma posible entre los numeros para que la solucion sea el otro");
		}
		
		sc.close(); //Se cierra el objeto Scanner

	}
}
