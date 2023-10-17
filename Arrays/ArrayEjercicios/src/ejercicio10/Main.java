package ejercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int cien[] = new int[100];
		int num;
		int cont = 0;
		
		Scanner sca = new Scanner(System.in);
		
		for (int i = 0; i < cien.length; i++) {
			cien[i] = (int)(1 + Math.random()*10);
		}
		do {
		System.out.println("Introduzca un numero del 1 al 10");
		num = sca.nextInt();
		} while (num > 10);
		
		for (int nume: cien) {
			if (nume == num) {
				cont++;
			}
		}
		
		System.out.println("Hay "+ cont + " " + num );
		sca.close();

	}

}
