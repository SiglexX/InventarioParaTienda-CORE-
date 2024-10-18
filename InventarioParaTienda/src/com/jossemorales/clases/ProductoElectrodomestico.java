package com.jossemorales.clases;

public class ProductoElectrodomestico {
	private String nombre;
	private double precio;
	private int cantidad;
	
	public ProductoElectrodomestico(String nombre, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public void mostrarInformacion() {
		System.out.println("");
		System.out.println("Nombre del producto: " + this.nombre);
		System.out.println("Cantidad disponible: " + this.cantidad);
		System.out.println("Precio: " + this.precio);
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
	
}
