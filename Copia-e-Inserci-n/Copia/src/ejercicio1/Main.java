package ejercicio1;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        int numeros[]= new int[15];
        int aux;
        
        Scanner sca = new Scanner(System.in);

        // Leer 15 números del teclado y almacenarlos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = sca.nextInt();
        }

        // Rotar los elementos del array
        aux = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = aux;

        // Mostrar el contenido del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
