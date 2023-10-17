package tema1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio2 {

	public static void main(String[] args) {
		//Establecemos variables
		int num; //En esta variable guardaremos el valor introduccido por el usuario
		int num1; //En esta variable guardaremos el valor de la operacion
		int resto;
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca un numero
		System.out.print("Por favor introduzca un numero entero: ");
		num = sc.nextInt(); //Se lee el numero del usuario en la variable
		
		resto = (7 - num%7) != 7 ? (7 - num%7) : 0; //
		
		num1 = num + resto; //Al numero del usuario le sumamos la resta de 7 menos el modulo
		
		//Se le ofrece al usuario los resultados
		System.out.println("Su numero para que sea multiplo de 7 hay que sumarle " + resto + " Con resultado: " + num1);
		
		sc.close(); //Se cierra el objeto Scanner

	}

}
