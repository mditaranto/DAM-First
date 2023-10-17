package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int N, M;
		
		Scanner sca = new Scanner(System.in);
		
		N = sca.nextInt();
		M = sca.nextInt();
		
		int array[] = new int[N];
		
		Arrays.fill(array, M);
		
		System.out.println(Arrays.toString(array));
		
		sca.close();

	}

}
