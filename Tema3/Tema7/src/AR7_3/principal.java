package AR7_3;

public class principal {
    public static void main(String[] args) {
        /*
            Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco.
            Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
            Diseñar un método que permita recuperar y modificar el nombre del banco (al que pertenecen todas
            las cuentas corrientes). 
         */

        CuentaCorriente c;
		c = new CuentaCorriente ("12345678A", "Pepe"); // Cuenta de Pepe con DNI 12.345.678-A
		c.ingreso(1000); // ingresamos 1000 euros
		c.egreso(300); // sacamos 300 euros, quedarán 700
		c.mostrarInformacion(); // mostramos
        c.dni = "11111111-T";
        c.nombre = "Antonio";
		System.out.println("Puedo sacar 700 euros: "+ c.egreso(700)); //quedan 0 euros
		System.out.println("Puedo sacar 500 euros: "+ c.egreso(500)); //no es posible	
        
    }
}