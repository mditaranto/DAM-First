package ejercicio;

import java.util.Map;
/**
 * Clase para generar el menu
 * @author mditaranto
 *
 */
public class Menu {

	/**
	 *Metodo que da de alta un producto
	 * @param productos la coleccion a tratar
	 * @param nombre Nombre del producto
	 * @param precio precio del producto
	 */
	static public void altaProductos(Map<String, Integer> productos, String nombre, int precio) {
		if (precio >= 0) {
			productos.put(nombre, precio);
		} else {
			System.out.println("El precio es negativo");
		}
	}

	/**
	 * Metodo que da de baja los productos
	 * @param productos Coleccion a tratar
	 * @param nombre nombre del producto a retirar
	 */
	static public void bajaProductos(Map<String, Integer> productos, String nombre) {
		if (productos.containsKey(nombre)) {
			productos.remove(nombre);
		} else {
			System.out.println("Ese producto no se encuentra en la tienda");
		}
	}

	/**
	 * Metodo que imprime la lista de productos
	 * @param productos
	 */
	static public void lista(Map<String, Integer> productos) {
		System.out.println(productos);
	}

	/**
	 * Metodo que imprime el menu
	 */
	static public void menu() {
		System.out.println("Bienvenidos a la tienda");
		System.out.println("------------------------");
		System.out.println("[1] Para dar de alta un producto");
		System.out.println("[2] Para dar de baja un producto");
		System.out.println("[3] Para ver la lista de productos");
		System.out.println("[0] Para abandonar la tienda");
	}

}
