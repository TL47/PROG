package AR7_2;

public class principal {
    public static void main(String[] args) {
        CuentaCorriente c;
		c = new CuentaCorriente ("1234567A", "Pepe"); // Cuenta de Pepe con DNI 12.345.678-A
		c.ingreso(1000); // ingresamos 1000 euros
		c.egreso(300); // sacamos 300 euros, quedarán 700
		c.mostrarInformacion(); // mostramos
		System.out.println("Puedo sacar 700 euros: "+ c.egreso(700)); //quedan 0 euros
		System.out.println("Puedo sacar 500 euros: "+ c.egreso(500)); //no es posible	
	}
}