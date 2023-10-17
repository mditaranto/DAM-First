package ejercicios1;

/**
 * Clase que guarda una cuenta corriente
 * 
 * @author mditaranto
 *
 */
public class CuentaCorriente {

	/**
	 * Atributo de un dni
	 */
	protected int dni;

	/**
	 * Atributo para guardar el nombre
	 */
	protected String nombre;

	/**
	 * Atributo para guardar el saldo de la cuenta
	 */
	protected int saldo;

	/**
	 * enumerador que indica el sexo
	 * 
	 * @author mditaranto
	 *
	 */
	protected enum Sexo {
		Masculino, Femenino
	};

	/**
	 * Atributo para guardar el sexo;
	 */
	Sexo sexo;

	/**
	 * constructor con parametros
	 * 
	 * @param dni
	 * @param saldo
	 * @param nombre
	 */

	public void dniNombre(int dni, int saldo, String nombre, String sexo) {
		this.dni = dni;
		this.saldo = saldo;
		this.nombre = nombre;
		this.sexo = Sexo.valueOf(sexo);
	}

	/**
	 * constructor con parametros
	 * 
	 * @param dni
	 * @param saldo
	 */
	public void dniSaldo(int dni, int saldo, String sexo) {
		this.dni = dni;
		this.saldo = saldo;
		this.sexo = Sexo.valueOf(sexo);
	}

	/**
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = Sexo.valueOf(sexo);
	}

	/**
	 * Metodo para sacar dinero de la cuenta
	 * 
	 * @param dinero
	 */
	public void sacarDinero(int dinero) {

		if (saldo > dinero) {
			saldo -= dinero;
		} else {
			System.out.println("No tiene saldo suficiente en la cuenta");
		}
	}

	/**
	 * Metodo para ingresar dinero a la cuenta
	 * 
	 * @param dinero
	 */
	public void ingresarDinero(int dinero) {
		saldo += dinero;
	}

	/**
	 * Metodo para mostrar la informacion de la cuenta
	 */
	public void mostrarInformacion() {
		System.out.println("La cuenta a nombre de " + dni + " tiene " + saldo + " euros" + " de sexo " + sexo);
	}
}
