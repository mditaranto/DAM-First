package boletin1;

import java.util.Scanner;  //Importamos el objeto Scanner

public class Ejercicio6 {

	public static void main(String[] args) {
		//Establecemos variables
		int a; //En esta variable guardaremos el valor para a
		int b; //En esta variable guardaremos el valor para b
		int c; //En esta variable guardaremos el valor para c
		double x1, x2; //En esta variable guardaremos el valor para las 2 posibles soluciones
		double raiz; //En esta variable guardaremos el valor para la raiz
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		/*Se le pide al usuario que introduzca valores para a,b y c 
		y se leen en sus respectivas variables*/
		System.out.print("a:");
		a = sc.nextInt();
		System.out.print("b:");
		b = sc.nextInt();
		System.out.print("c:");
		c = sc.nextInt();
		
		raiz = (b*b)-4*a*c; //Se calcula la raiz para saber si es posbile realizar la ecuacion
		
		//Se aplica la formula de ecuaciones de 2º grado
		x1 = (-b+Math.sqrt(raiz))/2*a; 
		x2 = (-b-Math.sqrt(raiz))/2*a;
		
		//Con un condicional se ofrecen los resultados
		if (raiz < 0) { //Si la raiz da una solucion irreal: 
			System.out.println("la ecuacion no tiene solucion real");
		} else { //Si no:
			System.out.print("Las soluciones son " + x1 + " y " + x2);
		}
		
		sc.close(); //Se cierra el objeto Scanner
		
	}
}
