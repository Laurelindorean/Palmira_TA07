package ejercicio4_TareaUD07;

import java.util.Hashtable;

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
	public Ventas(Hashtable<String, Articulo> ventas, double pagado, double precioTotal) {
		this.ventas = ventas;
		this.pagado = pagado;
		this.precioTotal = precioTotal;
		this.cambio = pagado - precioTotal;
	}
	public Ventas() {
		
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
