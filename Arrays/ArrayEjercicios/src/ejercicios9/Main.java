package ejercicios9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double temp[] = new double[12];
		
		Scanner sca = new Scanner(System.in);
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = sca.nextDouble();
		}

		for (double barra: temp) {
			for (int i = 1; i <= barra; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sca.close();
	}

}
