package xd;

public class Capicua {

	// Esta funcion indica si el numero es capicua
	boolean esCapicua(int numero) {
		// Creacion de la variable que se utilizara como auxiliar
		int aux;
		// Creacion de la variable donde se guardaran las cifras
		int cifra;
		// Creacion de la variable donde se guardara el inverso del numero
		int inverso = 0;
		// Creacion de la variable donde se guardara el resultado
		boolean res;

		// le damos la vuelta al número separando numero por numero
		aux = numero;
		while (aux != 0) {
			cifra = aux % 10; // Sacamos el numero de las unidades
			// al numero anterior lo multiplicamos por 10 y sumamos la cifra sacada de las
			// unidades
			inverso = inverso * 10 + cifra;
			// dividimos el numero entre 10 para descartar las unidades que acabamos de
			// extraer
			aux = aux / 10;
		}

		// Si el inverso es igual al numero
		if (numero == inverso) {
			// Es capicua
			res = true;
		} else { // En caso contrario, no lo es.
			res = false;
		}
		// Se devuelve el valor
		return res;
	}
}
