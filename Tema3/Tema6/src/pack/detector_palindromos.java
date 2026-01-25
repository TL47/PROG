package pack;

import java.util.*;

public class detector_palindromos {
	
	static boolean palindromo(String frase) {
		boolean es;
		char c;
		String nueva = "";
		for (int i = frase.length() - 1; i >= 0; i--) {
			c = frase.charAt(i);
			nueva = nueva + c;
		}
		
			if (frase.equals(nueva)) {
				es = true;
			} else {
				es = false;
			}
			
			return es;
	}

	public static void main(String[] args) {
		/*
		 * Enunciado: Un palíndromo es una palabra o frase que se lee igual de izquierda a derecha que de derecha a izquierda
		 * (ejemplo: "reconocer" o "Ana"). Escribe un programa que determine si una cadena introducida es un palíndromo.
		 * Nota: Debes ignorar mayúsculas/minúsculas y los espacios en blanco (ejemplo: "Anita lava la tina" debe contar como palíndromo).
		 */
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una palabra o frase palíndroma: ");
		String frase = sc.nextLine().toLowerCase().replace(" ", "");
		boolean resultado;
		resultado = palindromo(frase);
		System.out.println(resultado);
	}
}
