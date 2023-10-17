package ejercicio1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int aleat[] = new int[20];
		int indiceBorrar = 0;

		RellenarArray.rellenar(aleat);

		Arrays.sort(aleat);

		for (int i = 1; i < 100; i++) {
			indiceBorrar = Arrays.binarySearch(aleat, i);
			while (indiceBorrar >= 0 && i % 2 != 0) {
				System.arraycopy(aleat, indiceBorrar + 1, aleat, indiceBorrar, aleat.length - indiceBorrar - 1);
				aleat = Arrays.copyOf(aleat, aleat.length - 1);
				indiceBorrar = Arrays.binarySearch(aleat, i);
			}
		}
		System.out.println(Arrays.toString(aleat));

	}

}
