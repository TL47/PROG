package pack;

import java.util.*;

public class Boletin1_R1 {
	
	static void comprobarPrimo(int n, int i) {
		if (i >= n) {
			System.out.println("El número es primo");
		} else if (n % i == 0) {
			System.out.println("El número no es primo");
		} else {
			i++;
			comprobarPrimo(n, i);
		}
	}

	public static void main(String[] args) {
		/*
		 * Resolver mediante el uso de funciones recursivas:
		 * Leer un número y decir si es primo o no.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduzca el número: ");
		num = sc.nextInt();
		comprobarPrimo(num, 2);
	}

}
