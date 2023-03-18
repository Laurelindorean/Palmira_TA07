/**
 * 
 */
package ejercicio4_TareaUD07;

import java.util.Hashtable;

/**
 * @author Palmira
 *
 */
public class Ejercicio4 {
	
	/*
	 * 4. Combina los métodos generados en las actividades 2 y 3 creando una
	 * aplicación que gestione ventas y control de stock en una misma interfaz.
	 * Utiliza para ello las estructuras de datos que creas conveniente.
	 */
	public static Hashtable<String, Articulo> datosStock(){
		Hashtable<String, Articulo> stock = new Hashtable();
		stock.put("agua", new Articulo("agua", 1.5, 18, 0.04));
		stock.put("coca-cola", new Articulo("coca-cola", 2.10, 5, 0.21));
		stock.put("pan", new Articulo("pan", 0.9, 2, 0.04));
		stock.put("platano", new Articulo("platano", 0.20, 15, 0.04));
		stock.put("chocolate", new Articulo("chocolate", 1.20, 2, 0.21));
		stock.put("pechuga", new Articulo("pechuga", 2.55, 2, 0.04));
		stock.put("tomate", new Articulo("tomate", 0.15, 50, 0.04));
		stock.put("yogur", new Articulo("yogur", 1.50, 10, 0.21));
		stock.put("compreas", new Articulo("compresas", 3.45, 20, 0.21));
		return stock;
	}
	
	public static void main(String[] args) {
		Super tienda1 = new Super(datosStock());
		tienda1.gestionSuper();
	}

}
