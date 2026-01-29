package AR7_1;

public class principal {

	public static void main(String[] args) {
		/*
		 * Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así
		 * como el saldo. Las operaciones típicas con una cuenta corriente son:
		 * - Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
		 * - Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si
		 *   existe saldo suficiente.
		 * - Ingresar dinero: se incrementa el saldo.
		 * - Mostrar información: muestra la información disponible de la cuenta corriente.
		 */

		CuentaCorriente c;
		c = new CuentaCorriente ("1234567A", "Pepe"); // Cuenta de Pepe con DNI 12.345.678-A
		c.ingreso(1000); // ingresamos 1000 euros
		c.egreso(300); // sacamos 300 euros, quedarán 700
		c.mostrarInformacion(); // mostramos
		System.out.println("Puedo sacar 700 euros: "+ c.egreso(700)); //quedan 0 euros
		System.out.printin ("Puedo sacar 500 euros: "+ c.egreso(500)); //no es posible
	}

}
