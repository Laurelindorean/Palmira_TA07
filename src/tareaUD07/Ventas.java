package tareaUD07;

import java.util.ArrayList;

public class Ventas {

	private double precioBruto;
	private int IVAAplicado;
	private int cantidadArticulos;
	private double precioIVA;
	private double cantidadPagada;
	private String cambio;
	private double precioTotal;
	
	public Ventas(double precioBruto, int IVAAplicado, int cantidadArticulos, double cantidadPagada) {
		super();
		this.precioBruto = precioBruto;
		this.IVAAplicado = IVAAplicado;
		this.cantidadArticulos = cantidadArticulos;
		this.precioIVA = precioBruto + (precioBruto*(IVAAplicado/100));
		this.precioTotal = precioIVA * cantidadArticulos;
		this.cantidadPagada =cantidadPagada;
		this.cambio = cambio(precioTotal, cantidadPagada);
	}
	public String cambio(double precio, double pagado) {
		
		if(precio==pagado) {
			return "Cantidad Exacta. No hay cambio";
		}else if(pagado<precio) {
			return "Falta dinero. Falta por pagar " + (precio-pagado);
		}else {
			return (pagado-precio) + "€";
		}
	}
	
	public double getIVAAplicado() {
		return IVAAplicado;
	}

	public void setIVAAplicado(int iVAAplicado) {
		IVAAplicado = iVAAplicado;
	}

	public double getPrecioIVA() {
		return precioIVA;
	}

	public void setPrecioIVA(double precioIVA) {
		this.precioIVA = precioIVA;
	}

	public double getCantidadPagada() {
		return cantidadPagada;
	}

	public void setCantidadPagada(double cantidadPagada) {
		this.cantidadPagada = cantidadPagada;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public double getPrecioBruto() {
		return precioBruto;
	}
	public void setPrecioBruto(double precioBruto) {
		this.precioBruto = precioBruto;
	}

	@Override
	public String toString() {
		return "Ventas: Precio Bruto :" + precioBruto + "\n IVA:" + IVAAplicado + "%"+ "\n Cantidad: "
				+ cantidadArticulos + "\n Precio con IVA:" + precioIVA + "€" + "\n Precio total:" + precioTotal + "€" + "\n Cantidad pagada:" + cantidadPagada +"€ " + "\n Cambio="
				+ cambio ;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public int getCantidadArticulos() {
		return cantidadArticulos;
	}
	public void setCantidadArticulos(int cantidadArticulos) {
		this.cantidadArticulos = cantidadArticulos;
	}
	
	
	
	
}
