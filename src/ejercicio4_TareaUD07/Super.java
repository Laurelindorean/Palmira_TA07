/**
 * 
 */
package ejercicio4_TareaUD07;

import java.util.ArrayList;
import java.util.Hashtable;


import tareaUD07.Utils;

/**
 * @author Palmira
 *
 */
public class Super {

	public static ArrayList<Ventas> ventas = new ArrayList<>();
	public static Hashtable<String, Articulo> estoc = new Hashtable<>();

	public Super(Hashtable<String, Articulo> estoc) {
		Super.estoc = estoc;
	}

	private static void mostrarStock() {
		for (String key : estoc.keySet()) {
			System.out.println(key + ": " + estoc.get(key));
		}
	}

	private static void mostrarVentas() {
		for (int i = 0; i < ventas.size(); i++) {
			System.out.println(ventas.get(i));
		}
	}

	private static double ivaEscogido(int iva) {
		return (iva == 0) ? 0.04 : 0.21;
	}

	public void gestionSuper() {
		int opcion;
		boolean exit = false;

		do {
			System.out.println(
					"Opciones: " + "\n1-Mostrar stock" + "\n2-Mostrar ventas " + "\n3-Añadir articulo" + "\n4-Realizar una venta" + "\n0-Salir");
			opcion = Utils.pedirEntero();
			switch (opcion) {
			case 0:
				exit = true;
				break;
			case 1:
				if (estoc.isEmpty()) {
					System.out.println("No hay stock");
				} else {
					System.out.println("El stock actual es: ");
					mostrarStock();
				}
				break;
			case 2:
				if (ventas.isEmpty()) {
					System.out.println("No hay articulos en la cesta");
				} else {
					mostrarVentas();
				}

				break;
			case 3:
				String articulo = "";
				int articuloCantidad, iva;
				double precioSinIva;
				do {
					if (articulo.isEmpty()) {
						System.out.println("Introduzca un articulo nuevo");
						articulo = Utils.pedirString();
					} else {
						System.out.println("Ya existe " + articulo + ". Introduzca otro distinto: ");
						articulo = Utils.pedirString();
					}
				} while (estoc.containsKey(articulo.toLowerCase()));
				System.out.println("Introduzca la cantidad: ");
				articuloCantidad = Utils.pedirEntero();
				System.out.println("Introduzca el iva deseado: (4 o 21)");
				iva = Utils.pedirEntero();
				System.out.println("Introduzca el precio sin IVA: ");
				precioSinIva = Double.parseDouble(Utils.pedirString());
				estoc.put(articulo,
						new Articulo(articulo.toLowerCase(), precioSinIva, articuloCantidad, ivaEscogido(iva)));
				System.out.println("Articulo añadido");

				break;
			case 4 :
				Ventas venta = new Ventas();
				venta.comprar(estoc, ventas);
				break;
			default:
				System.out.println("Error. Debes introducir un número del 0-4");
			}
		} while (!exit);
		System.out.println("Programa terminado");
	}

	public static ArrayList<Ventas> getVentas() {
		return ventas;
	}

	public static void setVentas(ArrayList<Ventas> ventas) {
		Super.ventas = ventas;
	}

	public static Hashtable<String, Articulo> getEstoc() {
		return estoc;
	}

	public static void setEstoc(Hashtable<String, Articulo> estoc) {
		Super.estoc = estoc;
	}

}
