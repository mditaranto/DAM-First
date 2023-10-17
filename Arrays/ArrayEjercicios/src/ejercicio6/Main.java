package ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num[] = new int[8];
		
		Scanner sca = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sca.nextInt();
		}

		for (int par: num) {
			if (par%2==0) {
				System.out.println("par " + par);
			} else {
				System.out.println("impar " + par);
			}
		}
		sca.close();
	}

}
