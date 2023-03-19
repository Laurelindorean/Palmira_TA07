/**
 * 
 */
package ejercicio4_TareaUD07;

/**
 * @author Palmira
 *
 */
public class Articulo {

	private String nombre; // Nombre del articulo
	private double precio; // Precio del articulo
	private int cantidad; // Cantidad del articulo
	private double iva; // IVA aplicado

	/**
	 * @param nombre
	 * @param precio
	 * @param cantidad
	 * @param iva
	 */
	public Articulo(String nombre, double precio, int cantidad, double iva) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.iva = iva;
	}

	// Metodo para restar las ventas del stock
	public int stockVendido(int cantidadVendida) {
		int artVendido = 0;
		if (this.cantidad < cantidadVendida) {
			artVendido = this.cantidad;
			this.cantidad = 0;
		} else {
			artVendido = cantidadVendida;
			this.cantidad -= cantidadVendida;
		}
		return artVendido;
	}

	// metodo para sumar articulos
	public void entradaStock(int addStock) {
		this.cantidad += addStock;
	}

	// Metodo para calcular el precio
	public double ticket() {
		double precio = (this.getCantidad() * this.getPrecio());
		double precioIva = precio + (precio * this.getIva());
		return precioIva;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	@Override
	public String toString() {
		return "\nArticulo: " + this.nombre + "\n Cantidad: " + this.cantidad + "\n Precio unidad(Sin IVA): "
				+ this.precio + "\n IVA aplicado: " + String.format("%1$,.2f", this.iva) + "\n";
	}

}
