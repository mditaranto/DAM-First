package ejercicios;

public class Main {

	public static void main(String[] args) {
		
		Alumno array[] = new Alumno[30];
		int opcion = 0;
		int posicion;
		
		Alumno alum = new Alumno();
		
		switch (opcion) {
		case 1 -> {
			alum.listado(array);
		}
		case 2 -> {
			posicion = alum.posicionLibre(array);
			if (posicion > 0) {
				alum.nuevoAlumno(array, posicion);
			} else {
				System.out.println("No existe espacio para otro alumno");
			}
		}
		case 3 -> {
			
		}
		}

	}

}
