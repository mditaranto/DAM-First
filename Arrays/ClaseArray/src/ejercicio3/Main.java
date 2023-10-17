package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int array1[] = new int[10];
		int array2[] = new int[10];
		
		Scanner sca = new Scanner(System.in);
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sca.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sca.nextInt();
		}
		
		System.out.println(Arrays.equals(array1, array2));
		sca.close();


	}

}
