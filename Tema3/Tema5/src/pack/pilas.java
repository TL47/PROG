package pack;

import java.util.*;

public class pilas {

	static int menu() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("1.- Apilar (Inserción por la cima)");
			System.out.println("2.- Desapilar (Eliminación por la cima)");
			System.out.println("3.- Visualizar la pila (En orden de apilación)");
			opcion = sc.nextInt();
		} while (opcion < 1 || opcion > 3);
		return opcion;
	}
	
	static char[] apilar(int indicador, char t[]) {
		Scanner sc = new Scanner(System.in);
		char valor;
		System.out.println("¿Qué valor desea apilar?");
		valor = sc.next().charAt(0);
		t = Arrays.copyOf(t, t.length + 1);
		t[t.length - 1] = valor;
		return t;
	}
	
	static char[] desapilar(int indicador, char t[]) {
		char temp = 0;
		
		return t;
	}

	public static void main(String[] args) {
		/*
		 * Menú con las opciones:
		 * Apilar --> Inserción por la cima (Final)
		 * Desapilar --> Eliminar por la cima (Final)
		 * Visualizar pila --> En orden de apilación (Del índice 0 al t.length)
		 */

		int opcion, indicador = 0;
		char t[] = {};
		
		do {
			opcion = menu();
			switch(opcion) {
				case 1 -> {
					t = apilar(indicador, t);
					indicador++;
					System.out.println();
				}
				case 2 -> {
					desapilar(indicador, t);
					indicador--;
					System.out.println();
				}
				case 3 -> {
					System.out.println(Arrays.toString(t));
					System.out.println();
				}
			}
		} while (opcion <= 3);
		System.out.println("El programa a finalizado");
	}

}
