/**
 * 
 */
package ejercicio4_TareaUD07;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

import tareaUD07.Utils;

/**
 * @author Palmira
 *
 */
public class Super {

	public static ArrayList<Ventas> ventas = new ArrayList<>();
	public static Hashtable<String, Articulo> estoc = new Hashtable<>();

	public Super(Hashtable<String, Articulo> estoc) {
		this.estoc = estoc;
	}

	private static double ivaEscogido(int iva) {
		return (iva == 0) ? 0.04 : 0.21;
	}

	public void gestionSuper() {
		int opcion;
		boolean exit = false;
		
		do {
			System.out.println("Añadir articulo:  No-0, Si-1");
			opcion = Utils.pedirEntero();
			if(opcion == 1) {
				String articulo ="";
				int articuloCantidad, iva;
				double precioSinIva;
				do {
					if(articulo.isEmpty()) {
						System.out.println("Introduzca un articulo nuevo");
						articulo = Utils.pedirString();
					}else {
						System.out.println("Ya existe " + articulo + ". Introduzca otro distinto: ");
						articulo = Utils.pedirString();
					}
				}while(estoc.containsKey(articulo.toLowerCase()));
				System.out.println("Introduzca la cantidad: ");
				articuloCantidad = Utils.pedirEntero();
				System.out.println("Introduzca el iva deseado: (4 o 21)");
				iva=Utils.pedirEntero();
				System.out.println("Introduzca el precio sin IVA: ");
				precioSinIva = Utils.pedirReal();
				estoc.put(articulo, new Articulo(articulo.toLowerCase(), precioSinIva, articuloCantidad, ivaEscogido(iva)));
			}else {
				exit = true;
			}
		}while(!exit);
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
