/**
 * 
 */
package tareaUD07;

import java.util.Hashtable;

/**
 * @author Palmira
 *
 */
public class Ejercicio3 {

	/*
	 * 3. Crea una base de datos de 10 artículos para controlar el stock de
	 * productos de una tienda por medio de un diccionario de
	 * datos(articulo:precio). El usuario podrá añadir, por medio de interfaz visual
	 * artículos nuevos y cantidades de estos. El usario podrá consultar la
	 * información almacenada en el diccionario referente a un articulo concreto e
	 * incluso listar toda la información en la terrminal del programa.
	 */

	Hashtable<String, Hashtable<Double, Integer>> articulos = new Hashtable<>();
	

	public Hashtable<String, Hashtable<Double, Integer>> dbInicial() {
		Hashtable<Double, Integer> articulo1 = new Hashtable<>();
		articulo1.put(3.5, 20);
		Hashtable<Double, Integer> articulo2 = new Hashtable<>();
		articulo2.put(30.1, 1);
		Hashtable<Double, Integer> articulo3 = new Hashtable<>();
		articulo3.put(10.5, 2);
		Hashtable<Double, Integer> articulo4 = new Hashtable<>();
		articulo4.put(21.0, 5);
		Hashtable<Double, Integer> articulo5 = new Hashtable<>();
		articulo5.put(32.8, 3);
		Hashtable<Double, Integer> articulo6 = new Hashtable<>();
		articulo6.put(15.02, 10);
		Hashtable<Double, Integer> articulo7 = new Hashtable<>();
		articulo7.put(12.0, 4);
		Hashtable<Double, Integer> articulo8 = new Hashtable<>();
		articulo8.put(12.5, 10);
		Hashtable<Double, Integer> articulo9 = new Hashtable<>();
		articulo9.put(14.1, 3);
		Hashtable<Double, Integer> articulo10 = new Hashtable<>();
		articulo10.put(3.12, 2);

		articulos.put("refresco", articulo1);
		articulos.put("pantalon", articulo2);
		articulos.put("vajilla", articulo3);
		articulos.put("sandalias", articulo4);
		articulos.put("sudadera", articulo5);
		articulos.put("camiseta", articulo6);
		articulos.put("chaqueta", articulo7);
		articulos.put("pendientes", articulo8);
		articulos.put("libro", articulo9);
		articulos.put("cafe-latte", articulo10);

		return articulos;
	}


	@Override
	public String toString() {
		return "Stock de productos [Producto:" + articulos + "]";
	}


	public Hashtable<String, Hashtable<Double, Integer>> addProducto(
			Hashtable<String, Hashtable<Double, Integer>> articulos) {
		Hashtable<Double, Integer> mapaProductos = new Hashtable<>();

		System.out.println("Entra el nombre del producto a añadir");
		String nombre = Utils.pedirString();
		System.out.println("Marca el precio del producto");
		double precio = Utils.pedirReal();
		System.out.println("Cuantas unidades quieres añadir de este articulo?");
		int cantidad = Utils.pedirEntero();
		mapaProductos.put(precio, cantidad);
		articulos.put(nombre, mapaProductos);
		return articulos;
	
	}


	public Hashtable<String, Hashtable<Double, Integer>> getArticulos() {
		return articulos;
	}

	public void setArticulos(Hashtable<String, Hashtable<Double, Integer>> articulos) {
		this.articulos = articulos;
	}

}
