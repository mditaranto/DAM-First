package xd;

import java.util.Scanner;

public class ArraysBi {

	static int [][] arraysBi(int tabla[][]){
		
			int array [][] = tabla.clone();
			
			Scanner sca = new Scanner(System.in);
			
			for (int i = 0; i < tabla.length; i++) {
				for (int a = 0; a < tabla[i].length; a++) {
					array[i][a] = sca.nextInt();
				}
			}
			return array;
		}
	
	static void representarArray(int tabla[][]) {
		for (int i = 0; i < tabla.length; i++) {
			for (int a = 0; a < tabla[i].length; a++) {
				System.out.print(tabla[i][a] + " ");
			}
			System.out.println();
		}
	}
	}