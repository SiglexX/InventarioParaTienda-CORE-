package com.jossemorales.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
	private String marca;
	private int memoriaRam;
	private String numeroSerie;
	
	public ComputadoraPortatil(String nombre, double precio, int cantidad, String marca,
			int memoriaRam, String numeroSerie) {
		super(nombre, precio, cantidad);
		this.marca = marca;
		this.memoriaRam = memoriaRam;
		this.numeroSerie = numeroSerie;
	}
	
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Marca: " + this.marca);
		System.out.println("Memoria RAM: " + this.memoriaRam);
		System.out.println("Número de Serie: " + this.numeroSerie);
		System.out.println("--------------------------------------------");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	
}
