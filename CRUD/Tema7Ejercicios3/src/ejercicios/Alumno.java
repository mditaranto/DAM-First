package ejercicios;

import java.util.Scanner;

public class Alumno {
	/**
	 * Atributo para el nombre
	 */
	String nombre;
	
	/**
	 * Atributo para la nota media del alumno
	 */
	double notaMedia;

	/**
	 * 
	 */
	public Alumno() {
		
	}

	/**
	 * @param nombre
	 * @param notaMedia
	 */
	public Alumno(String nombre, double notaMedia) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the notaMedia
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * @param notaMedia the notaMedia to set
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno" + nombre + "notaMedia=" + notaMedia;
	}
	
	public void listado(Alumno[] array) {
		for (int i = 0; i < array.length; i++) {
			if (!array[i].getNombre().equals(null)) {
				System.out.println(array[i].toString());
			}
		}
	}
	
	public int posicionLibre(Alumno[] array) {
		int posicion = 0;
		while (posicion < array.length && !array[posicion].getNombre().equals(null)) {
			posicion++;
		}

		if (posicion == array.length) {
			posicion = -1;
		}

		return posicion;
	}
	
	public void nuevoAlumno(Alumno[] array, int posicion) {
		double notaMedia;
		String nombre;
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del alumno: ");
		nombre = sca.nextLine();
		
		System.out.println("Introduzca la nota media: ");
		notaMedia = sca.nextDouble();
		
		array[posicion] = new Alumno(nombre, notaMedia);
		
		
	}
	
	public void modificaAlumno() {

			String autor, titulo, genero;
			int duracion, codigo;

			System.out.println("Introduzca el codigo del disco");
			codigo = sca.nextInt();
			sca.nextLine();

			if (!array[codigo].getCodigo().equals("LIBRE")) {
				
				System.out.println("Introduzca un titulo al disco: ");
				array[codigo].setTitulo(sca.nextLine());

				System.out.println("Introduzca un autor al disco");
				array[codigo].setAutor(sca.nextLine());

				System.out.println("Introduzca un genero al disco");
				array[codigo].setGenero(sca.nextLine());

				System.out.println("Introduzca una duracion al disco");
				array[codigo].setDuracion(sca.nextInt());
			} else {
				System.out.println("No hay discos con ese codigo");
			}
		}
	}
	
	
}
