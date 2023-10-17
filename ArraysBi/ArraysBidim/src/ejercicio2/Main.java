package ejercicio2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int tabla [][] = new int [10][10];
		
		for (int a = 1; a <= 10; a++) {
			for (int b = 1; b <= 10; b++) {
				tabla [a - 1][b - 1] = a * b;
			}
		}
		System.out.println(Arrays.deepToString(tabla));

	}

}
