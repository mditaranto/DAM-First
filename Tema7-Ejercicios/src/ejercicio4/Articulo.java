package ejercicio4;

public class Articulo {

	/**
	 * Atributo para el nombre del articulo
	 */
	protected String nombre;
	
	/**
	 * Atributo para el precio del articulo
	 */
	protected int precio;
	
	/**
	 * atributo IVA fijo para cada articulo
	 */
	protected final double IVA = 21;
	
	/**
	 * Atributo de cantidad para cada articulo
	 */
	protected int cuantosQuedan;	
	
	/**
	 * Atributo Enumerador departamento
	 */
	protected Departamento departamento;
	
	/**
	 * Enumerador departamento
	 * @author mditaranto
	 *
	 */
	protected enum Departamento
	{Electronica, Alimentacion, Drogueria};

	/**
	 * Constructor con parametros
	 * @param nombre
	 * @param precio
	 * @param cuantosQuedan
	 * @param departamento
	 */
	public Articulo(String nombre, int precio, int cuantosQuedan, Departamento departamento) {

		this.nombre = nombre;

		if (precio > 0) {
			this.precio = precio;
		} else {
			System.out.println("No es un precio valido");
		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			System.out.println("No es una cantidad valida");
		}
		
		this.departamento = departamento;
		

	}
	
	/**
	 * Metodo para obtener el precio con el IVA
	 * @return el precio
	 */
	public double getPVP() {
		double preciof = precio;
	
		preciof += (precio * (IVA/100));
		
		return preciof;
	}
	
	/**
	 * Metodo para obtener el precio con el IVA y un descuento
	 * @param descuento el descuento a aplicar
	 * @return el precio
	 */
	public double getPVPdescuento(double descuento) {
			
		double preciof;

		preciof = (precio + (precio * (IVA / 100)) - (precio * (descuento / 100)));
		
		return preciof;
	}
	
	/**
	 * Metodo que verifica si se puede vender o no un articulo
	 * @param cantidad cantidad de articulos a vender
	 * @return 
	 */
	public boolean vender(int cantidad) {
		boolean vendible = false;
		
		if (cuantosQuedan >= cantidad) {
			vendible = true;
			cuantosQuedan -= cantidad;
		}
		
		return vendible;
	}
	
	/**
	 * Metodo para almacenar articulos
	 * @param cantidad cantidad a almacenar
	 */
	public void almacenar(int cantidad) {
		
		cuantosQuedan += cantidad;
		
	}

	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", precio=" + precio + ", IVA=" + IVA + ", cuantosQuedan=" + cuantosQuedan
				+ ", departamento=" + departamento + "]";
	}
	
	

}
