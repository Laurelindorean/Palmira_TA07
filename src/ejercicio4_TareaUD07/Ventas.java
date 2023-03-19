package ejercicio4_TareaUD07;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

import tareaUD07.Utils;

public class Ventas {

	Hashtable<String, Articulo> ventas = new Hashtable<>();
	private double pagado;
	private double cambio;
	private double precioTotal;

	/**
	 * @param ventas
	 * @param pagado
	 * @param cambio
	 */
	public Ventas(Hashtable<String, Articulo> ventas, int cantidad, double pagado, double precioTotal, double cambio) {
		this.ventas = ventas;
		this.pagado = pagado;
		this.precioTotal = precioTotal;
		this.cambio = cambio(pagado, precioTotal);
	}

	public double cambio(Double pagado, Double precio) {
		return pagado - precio;
	}

	public Ventas() {

	}

	// Metodo para calcular el precio de la cesta de la compra
	public static double precioCompra(Hashtable<String, Articulo> compra) {
		Set<String> cesta = compra.keySet();
		double precio = 0;
		for (String articulo : cesta) {
			precio += compra.get(articulo).ticket();
		}
		return precio;
	}

	public static double pago(double precioCompra) {
		double pagado;

		do {
			System.out.println("El precio de la compra es: " + String.format("%1$,.2f", precioCompra)
					+ "\nIntroduzca la cantidad que va a pagar: ");
			pagado = Utils.pedirReal();
		} while (pagado < precioCompra);
		return pagado;
	}

	public void comprar(Hashtable<String, Articulo> stock, ArrayList<Ventas> ventas) {
		String nombreArticulo;
		Hashtable<String, Articulo> compra = new Hashtable<String, Articulo>();
		boolean exit = false;
		int cantidad = 0;
		do {
			do {
				System.out.println("Que articulo quieres comprar?");
				nombreArticulo = Utils.pedirString();
				if (!(compra.get(nombreArticulo) == null)) {
					System.out.println("No quedan unidades");
				}
			} while (!(compra.get(nombreArticulo) == null));

			if (stock.containsKey(nombreArticulo.toLowerCase())) {
				System.out.println("Cuantas unidades de " + nombreArticulo + " quieres comprar?");
				cantidad = Utils.pedirEntero();
				compra.put(nombreArticulo, new Articulo(nombreArticulo, stock.get(nombreArticulo).getPrecio(),
						stock.get(nombreArticulo).stockVendido(cantidad), stock.get(nombreArticulo).getIva()));
				System.out.println("Desea añadir más productos? 0-No, 1-Si");
				int opcion = Utils.pedirEntero();
				if (opcion == 0) {
					double costeCompra = precioCompra(compra);
					double pagoRealizado = pago(costeCompra);
					ventas.add(new Ventas(compra, cantidad, pagoRealizado, costeCompra, getCambio()));
					exit = true;

				}

			} else {
				exit = true;
				System.out.println("El articulo no existe");

			}
		} while (!exit);
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Hashtable<String, Articulo> getVentas() {
		return ventas;
	}

	public void setVentas(Hashtable<String, Articulo> ventas) {
		this.ventas = ventas;
	}

	public double getPagado() {
		return pagado;
	}

	public void setPagado(double pagado) {
		this.pagado = pagado;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		return "\nPrecio Total: " + this.getPrecioTotal() + "\nPagado: " + this.getPagado() + "\nCambio: "
				+ String.format("%1$,.2f", this.getCambio()) + "\n";

	}

}
