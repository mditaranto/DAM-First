package ejercicio8;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int numeros[] = new int [10];
		int cuadrados[] = new int [10];
		int cubos[] = new int [10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*100);
			cuadrados[i] = (int)(Math.pow(numeros[i], 2));
			cubos[i] = (int)(Math.pow(numeros[i], 3));
		}
		System.out.println("Soluciones");
		for (int list: numeros) {
			System.out.println(list);
		}
		for (int list: cuadrados) {
			System.out.println(list);
		}
		for (int list: cubos) {
			System.out.println(list);
		}
		
	}

}
