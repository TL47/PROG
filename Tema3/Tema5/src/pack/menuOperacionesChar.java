package pack;

import java.util.*;

public class menuOperacionesChar {
	
	static int menu() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Selecciones una opción");
			System.out.println();
			System.out.println("1. Mostrar Todas");
			System.out.println("2. Consultar una posición");
			System.out.println("3. Añadir");
			System.out.println("4. Eliminar un caracter");
			System.out.println("5. Modificar una posición");
			System.out.println("6. Búsqueda de un caracter");
			System.out.println("7. Salir");
			opcion = sc.nextInt();
		} while (opcion < 1 || opcion > 7);
		return opcion;
		
	}
	
	static void mostrar(int indicador, char notas[]) {	
		for (int i = 0 ; i < indicador ; i++) {
			System.out.println(notas[i]);
		}
	}
	
	static void consultar(int indicador, char notas[]) {
		Scanner sc = new Scanner(System.in);
		int posicion = 0;
		do {
			System.out.println("Que posición quieres consultar: ");
			posicion = sc.nextInt();
		} while (posicion < 0 || posicion > indicador);
			System.out.println(notas[posicion]);
	}
	
	static void añadir(int indicador, char notas[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter: ");
		notas[indicador] = sc.next().charAt(0);
	}
	
	static void eliminar(int indicador, char notas[]) {
		int pos = busqueda(indicador, notas);
		if (pos == -1) {
			System.out.println("El caracter que desea eliminar no se ha encontrado");
		} else {
			for (int i = pos; i < indicador; i++) {
				notas[i] = notas[i + 1];
			}
		}
	}
	
	static void modificar(int indicador, char notas[]) {
		Scanner sc = new Scanner(System.in);
		int indice = 0;
		do {
			System.out.println("¿Qué posición desea modificar?");
			indice = sc.nextInt();
		} while (indice < 0 || indice > indicador);
		System.out.println("Introduce un caracter: ");
		notas[indice] = sc.next().charAt(0);
	}
	
	static int busqueda(int indicador, char notas[]) {
		Scanner sc = new Scanner(System.in);
		char valor = 0;
		int pos = -1;
		System.out.println("Introduce un caracter a buscar");
		valor = sc.next().charAt(0);
		int i;
		boolean esta = false;
		for(i = 0; i < indicador && !esta; i++) {
			if(notas[i] == valor) {
				esta = true;
				pos = i;
			}
		}
		
		return pos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char notas[] = new char [11];
		int n = 0, indice = 0, i = 0, opcion;		
		do {			
			opcion = menu();
			switch (opcion) {				
				case 1 -> {
					mostrar(i, notas);
					i++;
					System.out.println();
				}				
				case 2 -> {
					consultar(i, notas);
					System.out.println();
				}				
				case 3 -> {
					añadir(i, notas);
					i++;
					System.out.println();
				}				
				case 4 -> {
					eliminar(i, notas);
					i--;
					System.out.println();
				}				
				case 5 -> {
					modificar(i, notas);
					System.out.println();
				}
				case 6 -> {
					int pos = busqueda(i, notas);
					if (pos == -1) {
						System.out.println("El valor no se encuentra");
					} else {
						System.out.println("El valor se encuentra en la posición: "+ pos);
					}
					System.out.println();
				}
			}			
		} while (opcion != 7);
		System.out.println("El programa a finalizado");
	}

}
