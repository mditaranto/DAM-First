package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int edad, cont, mayor, suma;
		double media = 0;
		
		edad = cont = mayor = suma = 0;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("A continuacion se re velara la media de las edades introducidas, "
				+ "la suma total y cuantos alumnos son mayores de edad. ");
		System.out.println( "Para dejar de introducir edades, introduzca un numero negativo ");
		edad = sc.nextInt();
		
		while (edad>0) {
			cont++;
			suma += edad;
			media = suma/cont;
			if (edad>=18) {
				mayor++;
			}
			edad = sc.nextInt();
		}
		System.out.println("Hay " + cont + " alumnos, con una media de edad de " + media 
				+ " de los cuales " + mayor + " son mayores de edad. La suma de todas las edades es " + suma);
	}

}
