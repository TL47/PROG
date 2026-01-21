package pack;

import java.util.*;

public class Boletin1_1 {
	
	static void consecutivo(int num) {
		for(int i = num; i <= num + 4; i++) {
			if (esPrimo(i)) {
				System.out.println(i + " Es primo");
			}else {
				System.out.println(i + " No es primo");
			}
		}
	}
	
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

	public static void main(String[] args) {
		/*
		 *Escribe un programa que pida un número entero positivo por teclado y se lo pase a una función.
		 *Dicha función mostrará a continuación los 5 números consecutivos a partir del número introducido.
		 *Al lado de cada número se debe indicar si se trata de un primo o no. Ejemplo:
		 *Por favor, introduzca un número entero positivo: 17
		 *17 es primo
		 *18 no es primo
		 *19 es primo
		 *20 no es primo
		 *21 no es primo
		 */
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Introduce un número entero positivo");
		n = sc.nextInt();
		consecutivo(n);
		esPrimo(n);
		

	}

}
