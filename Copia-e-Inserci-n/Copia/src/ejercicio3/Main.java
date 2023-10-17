package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numeros [] = new int[10];    
		int aux [] = new int[10];    	
    	int puesto = 0;
    	int puestoneg = aux.length - 1;
    	
		Scanner sca = new Scanner(System.in);
		
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print("Introduzca un numero: ");
			numeros[i] = sca.nextInt();
			
			if(Primo.esPrimo(numeros[i])) { 
				aux[puesto] = numeros[i];
    			puesto++;
    		} else {
    			aux[puestoneg] = numeros[i];
    			puestoneg--;
    		}
    	}
    	System.out.println(Arrays.toString(aux));
    	sca.close();
	}

}
