package tema1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio3 {

	public static void main(String[] args) {
		//Establecemos variables
		int num; //En esta variable guardaremos el valor introduccido por el usuario
		int num1; //En esta variable guardaremos el segungo valor introduccido por el usuario
		int num2; //En esta variable guardaremos el valor de la operacion
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca un numero
		System.out.print("Por favor introduzca un numero entero: ");
		num = sc.nextInt(); //Se lee el numero del usuario en la variable
		//Se le pide al usuario que introduzca un segundo numero
		System.out.println("Por favor introduzca otro numero entero: ");
		num1 = sc.nextInt(); //Se lee el numero del usuario en la variable
		
		num2 = num + (num1 - num%num1); /*Al primer numero se le suma el resto de el segundo numero menos 
		el modulo entre el 1 y el 2*/
		
		//Se le ofrece al usuario los resultados
		System.out.println("Para que " + num + " sea multiplo de " + num1 + " hay que sumarle " + (num1 - num%num1) + " resultando en: " + num2);
		
		sc.close(); //Se cierra el objeto Scanner

	}
}

