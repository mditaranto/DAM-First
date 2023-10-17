package ejercicio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num[] = new int[10];
		
		Scanner sca = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sca.nextInt();

		}
		for (int i = 9; i >= 0; i--) {
			System.out.println(num[i]);
		}
		sca.close();
	}

}
