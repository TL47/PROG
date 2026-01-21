package pack;

import java.util.*;

public class AR4_1 {

	public static void main(String[] args) {
		/*
		 * Diseñar la función eco () a la que se le pasa como parámetro un número n, y muestra por
		 * pantalla n veces el mensaje "Есо...".
		 */
		
		Scanner sc = new Scanner (System.in);
		System.out.print ("Introduzca un número:");
		int n = sc.nextInt();
		System.out.println("--Antes de llamar a la función--");
		eco (n);
		System.out.println("--Después de 1lamar a la función--");
	}
		static void eco(int a) {
			
		for (int i = 0; 1 <a; i++)
		System.out.println("Eco...");
		
		}

	}


