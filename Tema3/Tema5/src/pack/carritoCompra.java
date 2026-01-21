package pack;

import java.util.Scanner;

public class carritoCompra {
	
	static int menu() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Selecciones una opción");
			System.out.println();
			System.out.println("1. Mostrar todos los productos existentes con su precio y cantidad comprada");
			System.out.println("2. Consultar la cantidad comprada de un rpoducto determinado");
			System.out.println("3. Añadir producto nuevo (introducir su precio)");
			System.out.println("4. Eliminar producto");
			System.out.println("5. Modificar precio de un producto");
			System.out.println("6. Consultar precio de un producto");
			System.out.println("7. Listar productos con sus precios y cantidades ordenador por sus compras");
			System.out.println("8. Mostrar producto con menor cantidad de compras");
			System.out.println("9. Mostrar producto con mayor cantidad de compras");
			System.out.println("10. Comprar un producto (1.- validar código producto, 2.- Realizar la compra)");
			System.out.println("11. Salir");
			opcion = sc.nextInt();
		} while (opcion < 1 || opcion > 11);
		return opcion;
	}
	
	static void mostrar(double precio[], int compra[], int indice) {
		for (int i = 0 ; i < indice ; i++) {
			System.out.println("El producto: " + i + " de precio: " + precio[i] + " tiene " + compra[i] + " cantidad de compras.");
		}
	}
	
	static void consultarCantidadProducto(int compra[], int indice) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce el código del producto que desea consultar: ");
			indice = sc.nextInt();
		} while (indice > 10 || indice < 0);
		System.out.println("El producto " + indice + " tiene " + compra[indice] + " cantidad de compras.");		
	}
	
	static void añadir(double precio[], int indice) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un producto nuevo (precio): ");
		precio[indice] = sc.nextDouble();
	}
	
	static void eliminar(double precio[], int compra[], int indice) {
		Scanner sc = new Scanner(System.in);
		int valor = 0, i, pos = -1;
		boolean esta = false;
		System.out.println("¿Qué producto desea eliminar?");
		valor = sc.nextInt();
		if (valor == 0 || valor == -1) {
			System.out.println("El producto que desea eliminar no se ha encontrado.");
		} else {
			for(i = 0; i < indice && !esta; i++) {
				if(precio[i] == valor) {
					esta = true;
					pos = i;
				}
				if (pos == -1) {
					System.out.println("El valor no se encuentra.");
				} else {
					System.out.println("El valor se encuentra en la posición: "+ pos);
				}
			}
			for (i = pos; i < indice; i++) {
				precio[i] = precio[i + 1];
				compra[i] = compra[i + 1];
			}
		}
	}
	
	static void modificarPrecio(double precio[], int indice) {
		Scanner sc = new Scanner(System.in);
		int valor = 0, nuevo = 0;
		System.out.println("¿Qué precio desea modificar?");
		valor = sc.nextInt();
		if (precio[valor] == 0) {
			System.out.println("El precio que desea modificar no existe.");
		} else {
			System.out.println("¿Cuál es el nuevo precio?");
			nuevo = sc.nextInt();
			precio[valor] = nuevo;	
		}
	}
	
	static void consultarPrecio(double precio[], int indice) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce el código del producto que desea consultar: ");
			indice = sc.nextInt();
		} while (indice > 10 || indice < 0);
		System.out.println("El producto: " + indice + " Cuesta: " + precio[indice] + " €");		
	}
	
	static void listarOrdenadoCompras(double precio[], int compra[], int indice) {
		for (int i = 0; i < indice - 1; i++) {
            for (int j = 0; j < indice - 1 - i; j++) {
                if (compra[j] > compra[j + 1]) {
                    int temp = compra[j];
                    compra[j] = compra[j + 1];
                    compra[j + 1] = temp;
                    
                    double tempPrecio = precio[j];
                   	precio[j] = precio[j + 1];
                   	precio[j + 1] = tempPrecio;
                }
            }
        }	
	}
	
	static void mostrarMenorCompras(double precio[], int compra[], int indice) {
		for (int i = 0; i < indice - 1; i++) {
            for (int j = 0; j < indice - 1 - i; j++) {
                if (compra[j] > compra[j + 1]) {
                    int temp = compra[j];
                    compra[j] = compra[j + 1];
                    compra[j + 1] = temp;
                    
                    double tempPrecio = precio[j];
                   	precio[j] = precio[j + 1];
                   	precio[j + 1] = tempPrecio;
                }
            }
        }
		
		System.out.println("El producto con la menor cantidad de compras es el que tiene precio: " + precio[0] + " €");
	}
	
	static void mostrarMayorCompras(double precio[], int compra[], int indice) {
		for (int i = 0; i < indice - 1; i++) {
            for (int j = 0; j < indice - 1 - i; j++) {
                if (compra[j] < compra[j + 1]) {
                    int temp = compra[j];
                    compra[j] = compra[j + 1];
                    compra[j + 1] = temp;
                    
                    double tempPrecio = precio[j];
                   	precio[j] = precio[j + 1];
                   	precio[j + 1] = tempPrecio;
                }
            }
        }
		
		System.out.println("El producto con la menor cantidad de compras es el que tiene precio: " + precio[0] + " €");
	}
	
	static void comprar(double precio[], int compra[], int indice) {
		Scanner sc = new Scanner(System.in);
		int valor = 0, cant = 0;
		System.out.println("Introduzca el código del producto que desea comprar: ");
		valor = sc.nextInt();
		if (valor > indice || valor < 0 || precio[valor] == 0) {
			System.out.println("El producto no esta en venta.");
		} else {
			System.out.println("Introduzca la cantidad: ");
			cant = sc.nextInt();
			compra[valor] = cant;
		}
		mostrar(precio, compra, indice);
	}

	public static void main(String[] args) {
		/*
		 * 10 productros; cada producto tiene un código y un precio.
		 * Para cada compra de un producto se almacenará su cantidad.
		 */
		
		int opcion, i = 0;
		double precio[] = new double [10];
		int compra[] = new int [10];
		do {	
			opcion = menu();
			switch (opcion) {
				case 1 -> {
					mostrar(precio, compra, i);
					System.out.println();
				}
				case 2 -> {
					consultarCantidadProducto(compra, i);
					System.out.println();
				}
				case 3 -> {
					añadir(precio, i);
					i++;
					System.out.println();
				}
				case 4 -> {
					eliminar(precio, compra, i);
					System.out.println();
				}
				case 5 -> {
					modificarPrecio(precio, i);
					System.out.println();
				}
				case 6 -> {
					consultarPrecio(precio, i);
					System.out.println();
				}
				case 7 -> {
					listarOrdenadoCompras(precio, compra, i);
					System.out.println();
				}
				case 8 -> {
					mostrarMenorCompras(precio, compra, i);
					System.out.println();
				}
				case 9 -> {
					mostrarMayorCompras(precio, compra, i);
					System.out.println();
				}
				case 10 -> {
					comprar(precio, compra, i);
					System.out.println();
				}
			}
		} while (opcion != 11);
		System.out.println("El programa a finalizado");		

	}

}
