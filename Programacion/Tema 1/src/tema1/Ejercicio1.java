package tema1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio1 {

	public static void main(String[] args) {
		//Definimos variables
		float num; //Esta variable sera la que usemos para guardar el introducido por el usuario	
		float num1; //Esta variable ayudara como intermediario en una operacion
		float num2; //Esta variable sera donde guardemos el resultado
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Le pedimos al usuario los datos necesarios
		System.out.print("Introduzca un numero con decimales: ");
		num = sc.nextFloat(); //Leemos el dato del usuario en la variable
		
		num1 = num - (int)num; //le restamos al dato su parte entera y guardamos el valor en la variable
		num2 = num1 >= 0.5 ? (int)++num : (int)num; /*Si el valor es mayor o igual a 0.5 entonces 
		recoge el valor deseado, si no, recoge otro valor*/ 
		
		System.out.println("Su numero redondeado al entero mas proximo seria: " + num2); //ofrecemos al usuario el resultado
		
		sc.close(); //Cerramos el objeto Scanner
		

	}

}
