package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int num;
		int media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 10 numeros y yo hare la media.");
		num = sc.nextInt();
		
		for (int i= 1; i <= 10; i++) {
			media = media + num;
			num = sc.nextInt();
		}
		media = media/10;
		System.out.println(media);
		
		sc.close();
	}

}
