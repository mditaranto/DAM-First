package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num = 1;
		int suma = 0;
		
		System.out.println("A continuacion se mostrara la suma de los 10 primeros impares");
		
		for (int i = 1; i<=10; i++) {
			suma += num;
			num += 2;
		}
		System.out.println(suma);

	}

}
