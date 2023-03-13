package tareaUD07;
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
		switch(opcion) {
		case 1:
			Ejercicio1 ej1 = new Ejercicio1();
			ej1.pedirDatos();
			break;
		case 2:
			Ejercicio2 ej2 = new Ejercicio2();
			ej2.addVentas();
			break;
			
		}
		
		
		
		
	}

}
