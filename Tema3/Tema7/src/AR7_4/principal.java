package AR7_4;

public class principal {
    public static void main(String[] args) {
        /*
        Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco.
        Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
        Diseñar un método que permita recuperar y modificar el nombre del banco (al que pertenecen
        todas las cuentas corrientes). 
         */
               
        CuentaCorriente c1, c2;
    c1 = new CuentaCorriente ("12345678-A", "Pepe"); //CuentaCorriente para Peре
    c2 = new CuentaCorriente ("999999999-E", "Ana"); //cuenta de Ana
    c1.mostrarInformacion();
    CuentaCorriente.setBanco ("Banco Central");
    c1.mostrarInformacion();
    CuentaCorriente.setBanco ("Caja");
    c1.mostrarinformacion();
    de Ahorros de Do-While");
    c2.mostrarInformacion();
        
    }
}