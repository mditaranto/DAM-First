package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int num;
		int fact;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero, yo le mostrare su factorial");
		num = sc.nextInt();

		fact = num;
		for (int i = num; i > 0; i--) {
			System.out.print(i + " x");
			if (fact != i) {
				fact *= i;
			}
		}
		System.out.println(" = " + fact );
		sc.close();
	}

}
