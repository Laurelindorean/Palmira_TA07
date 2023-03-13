/**
 * 
 */
package tareaUD07;

import java.util.ArrayList;

/**
 * @author Palmira
 *
 */
public class Ejercicio2 {

	/*
	 * Crea una aplicación que gestione el flujo de ventas de una caja de
	 * supermercado. El programa guardara las cantidades del carrito de compra
	 * dentro de una lista. Mostrará por pantalla la siguiente información: - IVA
	 * aplicado(21% o 4%) - precio total bruto y precio mas IVA - Numero de
	 * artículos comprados - Cantidad pagada - Cambio a devolver
	 */

	ArrayList<Ventas> ventas = new ArrayList<Ventas>();

	public void addVentas() {

		System.out.println("Entra el precio en bruto del articulo: ");
		double precioBruto = Double.parseDouble(Utils.pedirString());
		System.out.println("Entra el IVA a aplicar (4% o 21%)");
		int IVAaplicado = Utils.pedirEntero();
		System.out.println("Entra la cantidad deseada: ");
		int cantidad = Utils.pedirEntero();
		System.out.println("Entra la cantidad pagada: ");
		double cantidadPagada = Utils.pedirReal();
		
		Ventas venta = new Ventas(precioBruto, IVAaplicado, cantidad, cantidadPagada);
		ventas.add(venta);
		System.out.println(ventas.toString());
	}


	

	
	

}
