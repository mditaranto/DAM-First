package ejercicio2;

public class Main {

	public static void main(String[] args) {

		//Creacion de los objetos a testear
		Libro librito = new Libro("Mateo", "Juan", 3, 0, Libro.Genero.valueOf("Narrativo"));
		Libro librito2 = new Libro("Luis", "Matias", 6, 2, Libro.Genero.valueOf("Dramatico"));

		//Primer objeto
		//Realizamos 4 prestamos
		for (int i = 0; i < 4; i++) {
			if (librito.prestamo()) {
				System.out.println("Se ha realizado correctamente el prestamo");
			} else {
				System.out.println("No hay suficientes ejemplares");
			}
		}
		
		//Realizamos una devolucion
		if (librito.devolucion()) {
			System.out.println("La devolucion se ha realizado correctamente");
		}
		//Mostramos la informacion
		System.out.println(librito.toString());
		System.out.println();
		
		//Segundo objeto
		//Realizamos 4 prestamos
		for (int i = 0; i < 4; i++) {
			if (librito2.prestamo()) {
				System.out.println("Se ha realizado correctamente el prestamo");
			} else {
				System.out.println("No hay suficientes ejemplares");
			}
		}
		//Realizamos una devolucion
		if (librito.devolucion()) {
			System.out.println("La devolucion se ha realizado correctamente");
		}
		
		System.out.println(librito2.toString());
		//Mostramos la informacion

	}

}
