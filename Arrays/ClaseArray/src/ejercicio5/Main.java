package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int puntuacion[] = new int[8];
		
		Scanner sca = new Scanner(System.in);
		
		for (int i = 0; i < puntuacion.length; i++) {
			puntuacion[i] = sca.nextInt();
			
		}
		
		Arrays.sort(puntuacion);
		
		for (int i = puntuacion.length - 1; i >= 0 ; i--) {
			System.out.print(puntuacion[i] + ", ");
		}
		sca.close();
	}

}
