package ejercicio1;

import java.util.Scanner; //Importamos el objeto escaner

public class Ejercicio1 {

	public static void main(String[] args) {
		//Definimos variables
		final float Kperas;
		final float Kmanz;
		int Vperas;
		int Vmanz;
		float total;
		Kperas = 1.95f;
		Kmanz = 2.35f;
		
		Scanner sc = new Scanner(System.in); // Creamos el objeto escaner a nombre de "sc"
		
		// El programa pide y recoge los datos
		System.out.print("Introduzca las ventas en kilos de las peras: ");
		Vperas = sc.nextInt();
		System.out.print("Introduzca las ventas en kilos de las manzanas: ");
		Vmanz = sc.nextInt();
		
		//Se realizan operaciones necesarias
		total = Kperas * Vperas + Kmanz * Vmanz;
		// Se le ofrece al usuario los resultados de dichas operaciones
		System.out.println("Los beneficios anuales son: " + total + "euros.");
		
		sc.close(); // Cerramos el objeto escaner

	}

}
