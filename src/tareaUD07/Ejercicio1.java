/**
 * 
 */
package tareaUD07;

import java.util.Hashtable;

/**
 * @author Palmira
 *
 */
public class Ejercicio1 {

	/*
	 * 1. Crea una aplicación que calcule la nota media de los alumnos
	 * pertenecientes al curso de programación. Una vez calculada la nota media se
	 * guardara esta información en un diccionario de datos que almacene la nota
	 * media de cada alumno. Todos estos datos se han de proporcionar por pantalla.
	 */

	Hashtable<String, Double> notas = new Hashtable<String, Double>();

	public void pedirDatos() {
		System.out.println("Introduce el número de alumnos");
		int totalAlumnos = Utils.pedirEntero();
		for (int i = 0; i < totalAlumnos; i++) {
			String nombre = nombreAlumno(i);
			double notaMedia = calcularNotaMedia(nombre);
			notas.put(nombre, notaMedia);
		}
		mostrarNotas(notas);

	}

	public double calcularNotaMedia(String nombre) {

		System.out.println("Introduce las notas del alumno " + nombre + " (separadas por coma)");
		String[] notasAlumno = Utils.pedirString().split(",");
		double totalNotas = 0;
		for (String nota : notasAlumno) {
			totalNotas += Double.parseDouble(nota.trim());
		}
		return totalNotas / notasAlumno.length;
	}

	public String nombreAlumno(int numero) {
		System.out.println("Introduce el nombre del alumno " + (numero + 1) + ":");
		return Utils.pedirString();
	}
	
	public void mostrarNotas(Hashtable<String, Double> notas) {
		
		System.out.println("Nota media de cada alumno: ");
		for(String nombre : notas.keySet()) {
			System.out.println(nombre + ": " + notas.get(nombre));
		}
	}

}
