package ejercicio2;

/**
 * Clase que guarda informacion de un libro
 * 
 * @author mditaranto
 *
 */
public class Libro {

	/**
	 * Atributo del titulo del libro
	 */
	protected String titulo;
	/**
	 * Atributo del autor del libro
	 */
	protected String autor;
	/**
	 * Atributo que guarda cuantos ejemplares hay de dicho libro
	 */
	protected int ejemplares;
	/**
	 * Atributo que guarda cuantos ejemplares se han prestado
	 */
	protected int prestados;

	/**
	 * enumerador de tipo de atributo genero
	 * 
	 * @author mditaranto
	 *
	 */
	protected enum Genero {
		Narrativo, Lirico, Dramatico, Didactico, Poetico
	}

	/**
	 * Atributo de tipo genero
	 */
	protected Genero genero;

	/**
	 * Constructor sin parametros
	 */

	public Libro() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param titulo
	 * @param autor
	 * @param ejemplares
	 * @param prestados
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados, Genero genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
		this.genero = genero;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * Metodo que realiza el prestamo de un libro ejemplar
	 * 
	 * @return
	 */
	public boolean prestamo() {
		boolean estado = false;

		// Comprueba que haya suficientes ejemplares
		if (ejemplares > prestados) {
			estado = true;
			prestados++;
		}
		return estado;
	}

	/**
	 * Metodo que realiza la devolucion de un libro prestado
	 * 
	 * @return
	 */
	public boolean devolucion() {
		boolean estado = false;

		// Comprueba que haya al menos 1 libro prestado
		if (prestados > 0) {
			estado = true;
			prestados--;
		}

		return estado;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + ", genero=" + genero + "]";
	}

}
