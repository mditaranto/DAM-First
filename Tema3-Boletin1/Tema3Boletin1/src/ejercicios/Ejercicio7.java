package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int num = 0;
		double numaleat = 0;
	
		
		Scanner sc = new Scanner(System.in);
		
		numaleat = Math.random() * 100;
		numaleat = (int)numaleat;
		
		System.out.println("Intente adivinar el numero secreto (1 al 100).");
		System.out.println("Como ayuda le indicare si el numero es mayor "
				+ "o menor al que usted ha introducido :)");
		System.out.println("En caso de querer acabar el juego, inserte un numero negativo");
		num = sc.nextInt();
		
		while (num != numaleat && num>0) {
			if (num>numaleat) {
				System.out.println("El numero secreto es menor");
			} else {
				System.out.println("El numero secreto es mayor");
			}
			num = sc.nextInt();
		}
		System.out.println("Se acabo el juego");
	}

}
