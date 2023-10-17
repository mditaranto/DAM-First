package ejercicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Creacion de la coleccion
		// HashMap porque tiene pares de clave/valor y no importa el orden
		Map<String, Integer> productos = new HashMap<>();

		//Variable para guardar la opcion
		int opc;
		//Variable para el nombre del producto
		String nombre;
		//Variable para el precio del mismo
		int precio;

		Scanner sca = new Scanner(System.in);

		do {
			Menu.menu(); //Se muestra el menu
			opc = sca.nextInt(); //Se pide una opcion

			//Segun la opcion
			switch (opc) {
			case 1 -> {
				//Pedimos los datos e ingresamos la clave con el valor
				System.out.println("Ingrese el nombre del producto: ");
				nombre = sca.next();
				System.out.println("Ingrese el precio del mismo: ");
				precio = sca.nextInt();
				Menu.altaProductos(productos, nombre, precio);
			}
			case 2 -> {
				//Pedimos datos y eliminamos la clave
				System.out.println("Ingrese el nombre del producto: ");
				nombre = sca.next();
				Menu.bajaProductos(productos, nombre);
			}
			case 3 -> {
				//Mostramos la coleccion
				Menu.lista(productos);
			}
			case 0 -> {
				break;
			}
			}
		} while (opc != 0);

	}

}
