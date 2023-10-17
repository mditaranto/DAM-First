package tema1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio7 {

	public static void main(String[] args) {
		//Establecemos variables
		double mm; //En esta variable guardaremos el valor para los milimetros introduccidos por el usuario
		int cm; //En esta variable guardaremos el valor para los centrimetros introduccidos por el usuario
		double m; //En esta variable guardaremos el valor para los metros introduccidos por el usuario
	
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca los milimetros 
		System.out.print("Inserte una longitud en milimetros: ");
		mm = sc.nextDouble(); //Se lee el valor en su variable correspondiente
		//Se le pide al usuario que introduzca los milimetros
		System.out.print("Inserte una longitud en centimetros: ");
		cm = sc.nextInt(); //Se lee el valor en su variable correspondiente
		//Se le pide al usuario que introduzca los milimetros 
		System.out.print("Inserte una longitud en metros: ");
		m = sc.nextDouble();  //Se lee el valor en su variable correspondiente
		
		mm /= 10; //Dividimos entre 10 y asignamos (1cm = 10mm)
		m *= 100; //multiplicamos por 100 y asignamos (1m = 100cm)
		cm += m + mm; //Hacemos la suma de todas las variables transformadas en cm
		
		//Se le ofrece al usuario los resultados en centimetros
		System.out.print("La longitud introducida son: " + cm); 
		
		sc.close(); //Se cierra el objeto Scanner

	}

}
