package ejercicio4;

public class Main {

	public static void main(String[] args) {
		//Creacion de un array de objetos
		Articulo [] array = new Articulo[3];
		
		//Definimos cada objeto independientemente
		array[0] = new Articulo("Luis", 5, 5, Articulo.Departamento.valueOf("Drogueria"));
		array[1] = new Articulo("Mateo", 290, 70, Articulo.Departamento.valueOf("Electronica"));
		array[2] = new Articulo("Mateo", 50, 0, Articulo.Departamento.valueOf("Alimentacion"));
	
		//Mediante un for, para cada objeto:
		for (int a = 0; a < array.length; a++) { 
			//Mostramos su info
			System.out.println("Para el articulo " + array[a].toString());
			//Obtenemos su precio con IVA
			System.out.println(array[a].getPVP());
			//Obtenemos su precio con IVA y descuento
			System.out.println(array[a].getPVPdescuento(10));
			//Se vende (si es posible) una cantidad de articulos
			if (array[a].vender(10)) {
				System.out.println("Se ha vendido");
			} else {
				System.out.println("No se ha podido vender esa cantidad");
			}
			//Se almacena una cantidad de articulos
			array[a].almacenar(10);
			//Se vende (si es posible) una cantidad de articulos
			if (array[a].vender(10)) {
				System.out.println("Se ha vendido");
			} else {
				System.out.println("No se ha podido vender esa cantidad");
			}
		}
		

	}

}
