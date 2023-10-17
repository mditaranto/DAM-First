package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		int num;
		String sol = "Es primo";

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		if (num > 0) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					sol = "No es primo";
					break;
				} 
			}
			if (num==1) {
				sol = "No es primo";
			}
			System.out.println(sol);
		} else {
			System.out.println("No ha introducido un numero entero");
		}
		sc.close();

	}

}
