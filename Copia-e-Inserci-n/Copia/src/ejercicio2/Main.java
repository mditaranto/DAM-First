package ejercicio2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	
    	int numeros [] = new int[20];
    	int aux [] = new int[20];    	
    	int puesto = 0;
    	int puestoneg = aux.length - 1;
    	
    	for (int i = numeros.length - 1; i >= 0; i--) {
    		numeros[i] = (int)(Math.random()*100 + 1);
    		
    		if (numeros[i]%2==0) {
    			aux[puesto] = numeros[i];
    			puesto++;
    		} else {
    			aux[puestoneg] = numeros[i];
    			puestoneg--;
    		}
    	}
    	System.out.println(Arrays.toString(aux));
    	
    	
    }
}
