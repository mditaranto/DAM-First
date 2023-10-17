package ejercicio7;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int primitiva[] = new int[6];
		int primitivawin[] = new int[6];
		int aciertos = 0;

		for (int i = 0; i < primitiva.length; i++) {
			primitiva[i] = (int)(Math.random()*49+1);
			primitivawin[i] = (int)(Math.random()*49+1);
			
		}
		Arrays.sort(primitiva);
		Arrays.sort(primitivawin);
		
		for (int i = 0; i < primitiva.length; i++) {
			if (Arrays.binarySearch(primitiva, primitivawin[i]) > 0) {
				aciertos++;
			}
		}
		System.out.println("Hay " + aciertos + " aciertos");
		
	}

}
