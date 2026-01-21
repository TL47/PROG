package pack;

import java.util.*;

public class menuOperacionesPrueba {
	
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
	
	static void mostrar(int n, double notas[]) {
		for (int i = 0 ; i < n ; i++) {
			System.out.println(notas[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double notas[] = new double [11];
		int n, indice = 0;
		do {
			System.out.println("Introduce cuántas notas desea introducir: ");
			n = sc.nextInt();
		} while (n > 11);
	
		for (int i = 0; i < n; i++) {
			System.out.println("¿En que posicion desea introducir la nota?");
			indice = sc.nextInt();
			System.out.println("Introduce una nota: ");
			notas[indice] = sc.nextDouble();
		}
		int opcion;
		
		do {
			
			opcion = menu();
			switch (opcion) {
			
				case 1 -> {
					mostrar(n, notas);
				}
				
				case 2 -> {
					int posicion = 0;
					do {
						System.out.println("Que posición quieres consultar: ");
						posicion = sc.nextInt();
					} while (posicion < 0 || posicion > 10);
						System.out.println(notas[posicion]);
				}
				
				case 3 -> {
					int nc3, indicec3 = 0;
					do {
						System.out.println("Introduce cuántas notas desea introducir: ");
						nc3 = sc.nextInt();
					} while (n + nc3 > 11);
					for (int i = 0; i < nc3; i++) {
						do {
							System.out.println("¿En que posicion desea introducir la nota?");
							indicec3 = sc.nextInt();
						} while (indicec3 == indice);
						System.out.println("Introduce una nota: ");
						notas[indicec3] = sc.nextDouble();
					}
				}
				
				case 4 -> {
					
				}
			}
			
		} while (opcion != 6);

	}

}
