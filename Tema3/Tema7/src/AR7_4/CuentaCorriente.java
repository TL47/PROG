package AR7_4;

public class CuentaCorriente {
    String dni; //del titular
    public String nombre; //del titular
    private double saldo; //efectivo disponible en la cuenta
    //Los parámetros de entrada: nombre y dni, ocultan a los atributos de la clase
    //con el mismo identificador. Para acceder a ellos hay que utilizar this.
    CuentaCorriente(String dni, String nombre) { //constructor
        this.dni = dni; //DNI pasado como parámetro
        this.nombre = nombre; //nombre pasado como parámetro
        saldo = 0; //saldo inicial a cero
    }
    boolean egreso (double cant) { //sacar dinero de la cuenta corriente
        boolean operacionPosible;
        if (saldo> cant) { //s1 disponemos de saldo suficiente
        saldo -= cant;
        operacionPosible = true;
        } else { //no hay saldo disponible
            System.out.println ("No hay dinero suficiente");
            operacionPosible = false;
        }
        return (operacionPosible);
    }
    void ingreso(double cant) { //añadimos dinero a la cuenta corriente
        saldo += cant;
    }
    void mostrarInformacion() { //muestra el estado de la cuenta corriente
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo + " €");
    }
    CuentaCorriente (String dni, double saldo) { //constructor
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar"; //indicamos que no disponemos del nombre
    }
    CuentaCorriente(String dni, String nombre, double saldo) { //constructor
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    static private String nombreBanco = "International Java Bank"; //valor por defecto
        //este valor se asigna antes de crear ningún objeto
        static void setBanco(String nuevoNombre);
        nombreBanco = nuevoNombre;
        static String getBanco() {
        return nombreBanco;
        }
}