package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int notas[][] = new int[4][5];
		int media = 0;
		int notmax = 0;
		int notmin = Integer.MAX_VALUE;

		Scanner sca = new Scanner(System.in);

		for (int a = 0; a < 4; a++) {
			System.out.println("Introduzca las notas del alumno " + (a + 1));
			for (int b = 0; b < 5; b++) {
				notas[a][b] = sca.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(notas));
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				media += notas[i][j];
				notmin = Integer.MAX_VALUE;
				if (notas[i][j] < notmin) {
					notmin = notas[i][j];
				}
				if (notas[i][j] > notmax) {
					notmax = notas[i][j];
				}
			}
			media /= 5;
			System.out.println("La media del alumno " + (i + 1) + " es " + media);
			System.out.println("Su nota maxima es " + notmax + " y su minima " + notmin);
			media = notmax = notmin = 0;

		}

	}

}
