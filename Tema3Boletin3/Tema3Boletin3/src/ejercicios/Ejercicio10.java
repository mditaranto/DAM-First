package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int A;
		int B;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
 		
		for (int i = A; i<=B; i++) {
			System.out.println(i);
		}
		sc.close();

	}

}
