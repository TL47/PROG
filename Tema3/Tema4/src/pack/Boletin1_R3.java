package pack;

import java.util.*;

public class Boletin1_R3 {
	
	static void tablaMult(int num, int i, int tabla) {
		if (i == 11) {
			System.out.println();
		} else {
			tabla = num * i;
			System.out.println(num + " x " + i + " = " + tabla);
			i++;
			tablaMult(num, i, tabla);
		}
	}

	public static void main(String[] args) {
		/*
		 * Resolver mediante el uso de funciones recursivas:
		 * Leer un número entero positivo y mostrar su tabla de multiplicar.
		 */
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para ver su tabala de multiplicar: ");
		n = sc.nextInt();
		tablaMult(n, 0, 0);
	}

}

