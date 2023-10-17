package ejercicio1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[][] table = new int[5][5];
		
		for (int n = 0; n < 5; n++) {
			for (int m = 0; m < 5; m++) {
				table[n][m] = 10 * n + m;
			}
		}
		
		System.out.println(Arrays.deepToString(table));

	}

}
