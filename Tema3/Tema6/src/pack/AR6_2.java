package pack;

import java.util.*;

public class AR6_2 {

	public static void main(String[] args) {
		/*
		 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que
		 * contiene menos caracteres.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la primera frase");
		String frase1 = sc.nextLine();
		System.out.println("Introduce la segunda frase");
		String frase2 = sc.nextLine();
		int lf1 = frase1.length();
		int lf2 = frase2.length();
		if (lf1 == lf2) {
			System.out.println("Tienen la misma longitud");
		} else {
			if (lf1 > lf2) {
				System.out.println("La primera frase: " + frase1 + " es mayor que la segunda frase: " + frase2);
			} else {
				System.out.println("La segunda frase: " + frase2 + " es mayor que la primera frase: " + frase1);
			}
		}
		
	}

}
