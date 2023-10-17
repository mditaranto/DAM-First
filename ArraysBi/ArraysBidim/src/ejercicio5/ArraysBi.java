package ejercicio5;

public class ArraysBi {

	static int[][] arraysBi(int tabla[][]) {
		int array[][] = tabla.clone();

		for (int i = 0; i < tabla.length; i++) {
			for (int a = 0; a < tabla[i].length; a++) {
				array[i][a] = (int) (Math.random() * ((999 + 1) - 100) + 100);
			}
		}
		return array;
	}

	static void representarArray(int tabla[][]) {
		int sumali;
		int sumaco;
		int sumatotal = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			sumali = 0;
			for (int a = 0; a < tabla[i].length; a++) {
				System.out.print(tabla[i][a] + " ");
				sumali += tabla[i][a];
			}
			sumatotal += sumali;
			System.out.print(sumali);
			System.out.println();
		}
		
		for (int c = 0; c < tabla.length; c++) {
			sumaco = 0;
			for (int i = 0; i < tabla.length; i++) {
				for (int a = 0; a < tabla[i].length; a++) {
					if (c == a) {
						sumaco += tabla[i][a];
					}
				}
			}
			sumatotal += sumaco;
			System.out.print(sumaco + " ");
		}
		System.out.print(sumatotal);
	}
}
