package ejercicio3;

/**
 * Esta clase guarda la informacion de un punto
 * 
 * @author mditaranto
 *
 */
public class Punto {
	/**
	 * Atributo de la coordenada y
	 */
	protected int y;
	/**
	 * Atributo de la coordenada x
	 */
	protected int x;

	/**
	 * constructor con parametros
	 * 
	 * @param y
	 * @param x
	 */
	public Punto(int y, int x) {
		this.y = y;
		this.x = x;
	}

	/**
	 * Metodo que imprime la posicion del punto
	 */
	public void imprime() {
		System.out.println("(" + x + "," + y + ")");
	}

	/**
	 * Metodo setter de x e y
	 * 
	 * @param x
	 * @param y
	 */
	public void setXY(int x, int y) {
		this.y = y;
		this.x = x;
	}

	/**
	 * Metodo que desplaza el punto unas cantidades establecidas como parametros
	 * 
	 * @param dx distancia que se desplaza x
	 * @param dy distancia que se desplaza y
	 */
	public void desplaza(int dx, int dy) {
		x += dx;
		y += dy;
	}

	/**
	 * Metodo que calcula la distancia entre 2 puntos
	 * 
	 * @param p el punto con el que se quiere calcular la distancia
	 * @return la distancia
	 */
	public int distancia(Punto p) {
		int dist;
		dist = (int) (Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2)));
		return dist;
	}

}
