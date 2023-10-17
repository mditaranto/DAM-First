package ejercicio4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int num [][] = new int [3][6];
		
		num = ArraysBi.arraysBi(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println();
			for (int a = 0; a < num[i].length; a++) {
				System.out.print(num[i][a] + " ");
			}
		}
		
		

	}

}
