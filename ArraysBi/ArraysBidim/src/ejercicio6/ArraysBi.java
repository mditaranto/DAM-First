package ejercicio6;

public class ArraysBi {

	static int[][] arraysBi(int tabla[][]) {
		int array[][] = tabla.clone();

		for (int i = 0; i < tabla.length; i++) {
			for (int a = 0; a < tabla[i].length; a++) {
				array[i][a] = (int) (Math.random() * 1000 + 1);
			}
		}
		return array;
	}

}
