package ejercicios1;

public class Main {

	public static void main(String[] args) {
		// Creacion de los objetos a testear
		CuentaCorriente cuenta = new CuentaCorriente();
		CuentaCorriente cuenta2 = new CuentaCorriente();

		// Definicion de valores de los objetos
		cuenta.dniNombre(12345678, 78687878, "Mateo", "Masculino");
		cuenta2.dniNombre(34567890, 300, "Luis", "Femenino");

		// Sacamos dinero de las cuentas
		cuenta.sacarDinero(9000);
		cuenta2.sacarDinero(9000);

		// Mostramos su informacion
		cuenta.mostrarInformacion();
		cuenta2.mostrarInformacion();

		// Ingresamos dinero a las cuentas
		cuenta.ingresarDinero(9000);
		cuenta2.ingresarDinero(9000);

		// Mostramos su informacion
		cuenta.mostrarInformacion();
		cuenta2.mostrarInformacion();

	}

}
