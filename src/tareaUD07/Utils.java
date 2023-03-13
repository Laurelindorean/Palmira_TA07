/**
 * 
 */
package tareaUD07;

import java.util.Scanner;

/**
 * @author Palmira
 *
 */
public class Utils {
	
	public static String pedirString() {
		Scanner sc = new Scanner(System.in);
		String palabra = sc.nextLine();
		return palabra;
	}

	public static int pedirEntero() {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		return numero;
	}

	public static double pedirReal() {
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextDouble();
		return numero;
	}	
	
	public static String pedirPalabra() {
		Scanner sc = new Scanner(System.in);
		String palabra = sc.next();
		return palabra;
	}

}
