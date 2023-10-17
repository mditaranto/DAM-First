package ejercicio3;

public class Main {

	public static void main(String[] args) {
		// Variable para la x
		int x = 5;
		// Variable para la y
		int y = 2;

		// Creamos un punto con las coordenadas
		Punto a = new Punto(x, y);

		// Creamos un segundo punto
		Punto p = new Punto(1, 1);

		// Calculamos la distancia entre los 2 puntos
		System.out.println(a.distancia(p));

	}

}
