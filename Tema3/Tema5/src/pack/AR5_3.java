package pack;

import java.util.*;

public class AR5_3 {

	public static void main(String[] args) {
		/*
		 * Escribir una aplicación que solicite al usuario cuántos números desea introducir.
		 * A continuación, introducir por teclado esa cantidad de números enteros, y por último, mostrar en
		 * el orden inverso al introducido.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("¿Cuántos números desea introducir?");
		n = sc.nextInt();
		
		int t[] = new int [n];
		
		for (int i = 0; i < t.length; i++) {
			System.out.println("Introduzca un número: ");
			t[i] = sc.nextInt();
		}
		
		System.out.println("Los números en orden inverso son: ");
		for (int i = t.length - 1; i >= 0; i--) {
			System.out.println(t[i]);
		}
	}

}
