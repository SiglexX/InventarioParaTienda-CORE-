package com.jossemorales.clases;

public class Televisor extends ProductoElectrodomestico{
	private int tamañoPantalla;
	private String resolucion;
	
	public Televisor(String nombre, double precio, int cantidad, int tamañoPantalla,
			String resolucion) {
		super(nombre, precio, cantidad);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucion = resolucion;
	}
	
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Tamaño de Pantalla: " + this.tamañoPantalla);
		System.out.println("Resolución de Pantalla: " + this.resolucion);
		System.out.println("--------------------------------------------");
	}
	

	public int getTamañoPantalla() {
		return tamañoPantalla;
	}

	public void setTamañoPantalla(int tamañoPantalla) {
		this.tamañoPantalla = tamañoPantalla;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
}
