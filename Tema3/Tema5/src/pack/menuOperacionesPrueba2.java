package pack;

import java.util.*;

public class menuOperacionesPrueba2 {
	
	static int menu() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Selecciones una opción");
			System.out.println();
			System.out.println("1. Mostrar Todas");
			System.out.println("2. Consultar una posición");
			System.out.println("3. Añadir");
			System.out.println("4. Eliminar");
			System.out.println("5. Modificar");
			System.out.println("6. Salir");
			opcion = sc.nextInt();
		} while (opcion < 1 || opcion > 6);
		return opcion;
		
	}
	
	static void mostrar(double notas[]) {
		for (int i = 0 ; i < 10 ; i++) {
			if (notas[i] != -1) {
				System.out.println(notas[i]);
			}
		}
	}
	
	static void consultar(double notas[]) {
		Scanner sc = new Scanner(System.in);
		int posicion = 0;
		do {
			System.out.println("Que posición quieres consultar: ");
			posicion = sc.nextInt();
		} while (posicion < 0 || posicion > 10);
			System.out.println(notas[posicion]);
	}
	
	static void añadir(int i, double notas[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una nota: ");
		notas[i] = sc.nextDouble();
	}
	
	static void eliminar(double notas[]) {
		Scanner sc = new Scanner(System.in);
		int indice = 0;
		do {
			System.out.println("¿Qué posición desea eliminar?");
			indice = sc.nextInt();
		} while (notas[indice] == -1);
		notas[indice] = -1;
	}
	
	static void modificar(double notas[]) {
		Scanner sc = new Scanner(System.in);
		int indice = 0;
		do {
			System.out.println("¿Qué posición desea modificar?");
			indice = sc.nextInt();
		} while (indice < 0 || indice > 10);
		System.out.println("Introduce una nota: ");
		notas[indice] = sc.nextDouble();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double notas[] = new double [11];
		int n = 0, indice = 0, i = 0, opcion;		
		do {			
			opcion = menu();
			switch (opcion) {				
				case 1 -> {
					mostrar(notas);
					System.out.println();
				}				
				case 2 -> {
					consultar(notas);
					System.out.println();
				}				
				case 3 -> {
					añadir(i, notas);
					i++;
					System.out.println();
				}				
				case 4 -> {
					eliminar(notas);
					System.out.println();
				}				
				case 5 -> {
					modificar(notas);
					System.out.println();
				}
			}			
		} while (opcion != 6);
		System.out.println("El programa a finalizado");
	}

}
