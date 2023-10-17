package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero, contare hasta el");
		num = sc.nextInt();
		
		for (int i = 1; i<=num; i++)  {
			System.out.println(i);
		}
		sc.close();

	}

}
