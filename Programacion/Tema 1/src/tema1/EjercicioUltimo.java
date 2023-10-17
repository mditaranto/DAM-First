package tema1;

import java.util.Scanner; //Importamos el objeto Scanner

public class EjercicioUltimo {

	public static void main(String[] args) {
		//Establecemos variables
		double dist; //En esta variable guardaremos el valor para la distancia en metros
		int cm; //En esta variable guardaremos el valor para la operacion en centimetros
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca la distancia alcanzada
		System.out.print("Introduzca la distancia alcanzada en metros: ");
		dist = sc.nextDouble(); //Se lee el valor en su variable correspondiente
		
		cm = (int)(dist*100); //Se multiplica la distancia por 100 (1m = 100cm) y hago un cast
		
		//Se ofrece al usuario el resultado de la distancia en centimetros
		System.out.println("La distancia alcanzada son: " + cm + " cm."); 
		
		sc.close(); //Se cierra el objeto Scanner

	}

}
