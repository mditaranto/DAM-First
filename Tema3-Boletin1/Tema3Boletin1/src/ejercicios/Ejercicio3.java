package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num;
		double media = 0;
		int cont = 0;
		int suma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuacion se hara la media de todos los numeros introducidos"
				+ " para dejar de introducir numeros inserte uno negativo");
		
		num = sc.nextInt();
		
		while (num>=0) {
			cont++;
			suma += num;
			media = suma/cont;
			num = sc.nextInt();
		}

		System.out.println("la media de todos los numeros es " + media);
	}

}
