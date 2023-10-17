package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double max[] = new double[2];
		double num[] = new double[10];
		
		Scanner sca = new Scanner(System.in);
		
		max[0] = Double.MIN_VALUE;
		max[1] = Double.MAX_VALUE;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sca.nextDouble();
			
			if (num[i] > max[0]) {
				max[0] = num[i];
			}
			if (num[i] < max[1]) {
				max[1] = num[i];
			}
		}
		
		System.out.println(max[0] + " y " + max[1]);
		sca.close();

	}

}
