package pack;

import java.util.*;

public class cifrado_cesar {
	
	static String cifrado(String frase, int pos) {
		String nueva = "";
		for (int i = 0; i < frase.length(); i++) {
			nueva += (char) (frase.charAt(i) + pos);
		}
		return nueva;
	}

	public static void main(String[] args) {
		/*
		 * Enunciado: El cifrado César consiste en sustituir cada letra por la que está n posiciones más adelante en el abecedario. Crea un
		 * programa que pida una frase y un número entero (la clave). El programa debe mostrar la frase cifrada desplazando cada letra según la
		 * clave.
		 * Ejemplo: Si la clave es 1, "abc" se convierte en "bcd".
		 */
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine().toLowerCase();
		System.out.println("Introduce una clave: ");
		int pos = sc.nextInt();
		String resultado = cifrado(frase, pos);
		System.out.println(resultado);
	}
}