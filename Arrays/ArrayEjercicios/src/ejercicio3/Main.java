package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double num[] = new double[5];
		
		Scanner sca = new Scanner(System.in);
		
		for (int i = 0; i < num.length ; i++) {
			System.out.println("Introduzca: ");
			num[i] = sca.nextDouble();
		}
		
		for (double nume: num) {
			System.out.println(nume);
		}
		
		sca.close();

	}

}
