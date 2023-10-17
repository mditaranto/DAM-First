package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		double notas;
		int susp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i<=5 ; i++) {
			notas = sc.nextInt();
			if (notas<5) {
				susp++;
			}
		}
		System.out.println(susp);
		sc.close();
	}

}
