package tareaUD07;

import ejercicio4_TareaUD07.Ejercicio4;
import ejercicio4_TareaUD07.Super;

/**
 * 
 * @author Palmira
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Que ejercicio quieres corregir? ");
		int opcion = Utils.pedirEntero();
		switch (opcion) {
		case 1:
			Ejercicio1 ej1 = new Ejercicio1();
			ej1.pedirDatos();
			break;
		case 2:
			Ejercicio2 ej2 = new Ejercicio2();
			ej2.addVentas();
			break;
		case 3:
			Ejercicio3 ej3 = new Ejercicio3();
			System.out.print("Nuestra Base de datos de articulos inicial es : ");
			System.out.println(ej3.dbInicial().toString());
			System.out.println("\nQuieres añadir más articulos? (Si=1, No=0)");
			int chose = Utils.pedirEntero();
			do {
				ej3.addProducto(ej3.getArticulos());
				System.out.println("Quieres añadir más articulos? (Si=1, No=0)");
				chose = Utils.pedirEntero();
			} while (chose == 1);
			System.out.println("Gracias, estes es nuestro stock:");
			System.out.println(ej3.toString());
			break;
		case 4:
			Super tienda1 = new Super(Ejercicio4.datosStock());
			tienda1.gestionSuper();
			break;
		default:
			System.out.println("Error. Debes introducir un numero del 1-4");

		}

	}

}
