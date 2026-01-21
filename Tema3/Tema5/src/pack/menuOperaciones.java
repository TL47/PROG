package pack;

import java.util.*;

public class menuOperaciones {
	
	static int menu() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Selecciones una opción");
			System.out.println();
			System.out.println("1. Mostrar Todas");
			System.out.println("2. Consultar una posición");
			System.out.println("3. Añadir");
			System.out.println("4. Eliminar un valor");
			System.out.println("5. Modificar una posición");
			System.out.println("6. Búsqueda de un valor");
			System.out.println("7. Mostrar las notas de manera ordenada");
			System.out.println("8. Añadir una nota al principio");
			System.out.println("9. Añadir una nota en un posición válida");
			System.out.println("10. Salir");
			opcion = sc.nextInt();
		} while (opcion < 1 || opcion > 10);
		return opcion;
		
	}
	
	static void mostrar(int indicador, double notas[]) {
		for (int i = 0 ; i < indicador ; i++) {
			System.out.println(notas[i]);
		}
	}
	
	static void consultar(int indicador, double notas[]) {
		Scanner sc = new Scanner(System.in);
		int posicion = 0;
		do {
			System.out.println("Que posición quieres consultar: ");
			posicion = sc.nextInt();
		} while (posicion < 0 || posicion > indicador);
			System.out.println(notas[posicion]);
	}
	
	static void añadir(int indicador, double notas[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una nota: ");
		notas[indicador] = sc.nextDouble();
	}
	
	static void eliminar(int indicador, double notas[]) {
		int pos = busqueda(indicador, notas);
		if (pos == -1) {
			System.out.println("El valor que desea eliminar no se ha encontrado");
		} else {
			for (int i = pos; i < indicador; i++) {
				notas[i] = notas[i + 1];
			}
		}
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
	
	static int busqueda(int indicador, double notas[]) {
		Scanner sc = new Scanner(System.in);
		int valor = 0, pos = -1;
		System.out.println("Introduce un valor a buscar");
		valor = sc.nextInt();
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
	
	static void mostrarOrden(int indicador, double notas[]) {
		for (int i = 0; i < indicador - 1; i++) {
            for (int j = 0; j < indicador - 1 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    double temp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temp;
                }
            }
        }
		mostrar(indicador, notas);
	}
	
	static int añadirPrincipio(int indicador, double notas[]) {
		Scanner sc = new Scanner(System.in);
	    if (indicador < notas.length) {
	        for (int i = indicador; i > 0; i--) {
	            notas[i] = notas[i - 1];
	        }
	        System.out.println("Introduce una nota: ");
	        notas[0] = sc.nextDouble();
	        indicador++;
	    } else {
	        System.out.println("No hay espacio para añadir más notas.");
	    }
	    return indicador;
	}
	
	static int añadirEnPosicion(int indicador, double notas[]) {
		Scanner sc = new Scanner(System.in);
		int pos;
		do {
			System.out.println("¿En qué posición desea añadir una nueva nota?");
			pos = sc.nextInt();
		} while (pos < 0 || pos > indicador);
		
		for (int i = indicador; i > pos; i--) {
            notas[i] = notas[i - 1];
        }
		System.out.println("Introduce una nota: ");
		notas[pos] = sc.nextDouble();
		indicador++;
		return indicador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double notas[] = new double [11];
		int i = 0, opcion;		
		do {			
			opcion = menu();
			switch (opcion) {				
				case 1 -> {
					mostrar(i, notas);
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
					modificar(notas);
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
				case 7 -> {
					mostrarOrden(i, notas);
					System.out.println();
				}
				case 8 -> {
					i = añadirPrincipio(i, notas);
					System.out.println();
				}
				case 9 -> {
					i = añadirEnPosicion(i, notas);
					System.out.println();
				}
			}			
		} while (opcion != 10);
		System.out.println("El programa a finalizado");
	}

}