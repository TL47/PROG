package pack;

public class AA4_16 {
	
	
	static boolean esPrimo(int n) {
        boolean primo = true;
        if (n < 2) {
            primo = false;
        }
        for (int i = 2; i < n && primo; i++) {
            if (n % i == 0) {
                primo = false;
            }
        }
        return primo;
    }
	
	static void divisoresPrimos(int n) {
		int div = 0;
		for (int i = 2; i < n; i++) {
			if (n % 2 == 0)  {
				if (esPrimo(i)) {
					System.out.println("He encontrado un divisor " + i + " que es primo");
				}
			}
		}
	}
	

	public static void main(String[] args) {
		/*
		 *  Implementa la función divisoresPrimos() que muestra, por consola, todos los divisores primos
		 *  del número que se le pasa como parámetro.
		 */

		divisoresPrimos(30);
		
	}

}
