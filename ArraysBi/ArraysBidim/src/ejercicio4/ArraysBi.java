package ejercicio4;

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
	}

