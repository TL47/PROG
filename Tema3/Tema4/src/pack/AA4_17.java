package pack;

import java.util.*;

public class AA4_17 {
	
	static int sumaDivisores(int n) {
		int div = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				div += i;
			}
		}
		return div;
	}
	
	public static void main(String[] args) {
		/*
		 * Escribe una función que decida si dos números enteros positivos son amigos. Dos números
		 * a y b son amigos si la suma de los divisores propios (distintos de él mismo) de a
		 * es igual a b. Y viceversa.
		 * Para probar se pueden usar los números 220 y 284, que son amigos.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, s1, s2;
		System.out.println("Introduce el primer número: ");
		n1 = sc.nextInt();
		s1 = sumaDivisores(n1);
		System.out.println("Introduce el segundo número: ");
		n2 = sc.nextInt();
		s2 = sumaDivisores(n2);
		
		if (s1 == n2 && s2 == n1) {
			System.out.println("Son amigos");
		}else {
			System.out.println("No son amigos");
		}

	}

}
