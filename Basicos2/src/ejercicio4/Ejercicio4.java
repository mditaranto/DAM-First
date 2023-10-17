package ejercicio4;

import java.util.Scanner; //Importamos el objeto escaner

public class Ejercicio4 {

	public static void main(String[] args) {
		//Definimos variables
		boolean tarea;
		boolean llueve;
		boolean biblioteca;
		String msg;
		// Creamos el objeto escaner a nombre de "sc"
		Scanner sc =  new Scanner(System.in); 
		
		// El programa pide y recoge los datos
		System.out.print("Esta despejado?");
		llueve = sc.nextBoolean();
		System.out.print("Ha terminado sus deberes?");
		tarea = sc.nextBoolean();
		System.out.print("necesita ir a la biblioteca?");
		biblioteca = sc.nextBoolean();
		
		//En caso de true o false se ofrece una respuesta u otra
		msg = (llueve&&tarea)||biblioteca ? "Puedes salir" : "No puedes salir";
		// Se le ofrece al usuario los resultados
		System.out.println(msg);
		
		sc.close();// Cerramos el objeto escaner


	}

}
