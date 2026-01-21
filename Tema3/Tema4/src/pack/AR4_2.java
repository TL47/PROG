package pack;

import java.util.*;

public class AR4_2 {
	
	/*
	 * Escribir una función a la que se le pasen dos enteros y muestre todos los números
	 * comprendidos entre ellos
	 */
	
	static void mostrar(int a, int b) {
		int mayor = a > b? a: b;
		int menor = a < b?a: b;
		for (int i = menor; i <= mayor; i++) {
		System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
			System.out.print("Introduzca primer número: ");
			int a = sc.nextInt();
			System.out.print ("Introduzca segundo número:");
			int b = sc.nextInt();
			mostrar(a, b);
		
	}

}
