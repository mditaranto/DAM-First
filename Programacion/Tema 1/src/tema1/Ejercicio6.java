package tema1;

import java.util.Scanner; //Importamos el objeto Scanner

public class Ejercicio6 {

	public static void main(String[] args) {
		//Establecemos variables
		int seg; //En esta variable guardaremos el valor para los segundos introduccida por el usuario
		int horas; //En esta variable guardaremos el valor para las horas 
		int minutos; //En esta variable guardaremos el valor para los minutos 
		int segrest; //En esta variable guardaremos el valor para los segundos restantes
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca los segundos
		System.out.print("Introduzca una cantidad de segundos: ");
		seg = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		horas = (seg/3600); //Dividimos los segundos por 3600 (1 hora = 3600 segundos)
		minutos = (seg%3600)/60; //A los segundos restantes los dividimos entre 60 (1 min = 60 segundos)
		segrest = (seg%60)%60; //Los segundos restantes de los miniutos son los que sobran
		
		//Se le ofrece al usuario los resultados en horas, minutos y segundos
		System.out.println("Eso son: " + horas + " horas " + minutos + " minutos " + segrest + " segundos.");
		
		sc.close(); //Se cierra el objeto Scanner

	}

}
