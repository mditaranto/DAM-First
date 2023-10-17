package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribre un numero, contare los multiplos de 3 hasta el suso dicho.");
		num = sc.nextInt();
		
		for (int i = 1; i<=num; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
