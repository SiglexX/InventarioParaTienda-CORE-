package com.jossemorales.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	private ArrayList<ProductoElectrodomestico> listaDeProductos;
	
	public TiendaElectronica() {
		listaDeProductos = new ArrayList<>();
	}
	
	public void agregarProducto(ProductoElectrodomestico producto) {
		listaDeProductos.add(producto);
	}
	
	public void mostrarProductos() {
		for (ProductoElectrodomestico producto : listaDeProductos) {
			producto.mostrarInformacion();
		}
	}
	
	public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {
		for (ProductoElectrodomestico producto : listaDeProductos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				return producto;
			}
		}
		return null;
	}
	
	public void realizarVenta(String nombre, int cantidad) {
		ProductoElectrodomestico producto = buscarProductoPorNombre(nombre);
		if (producto != null) {
			int cantidadDisponible = producto.getCantidad();
			if (cantidadDisponible >= cantidad) {
				producto.setCantidad(cantidadDisponible - cantidad);
				System.out.println("");
				System.out.println("Se ha realizado la compra de " + cantidad + " " + nombre);
			}else {
				System.out.println("El producto se encuentra agotado");
			}
		} else {
			System.out.println("Producto no encontrado");
		}
	}
}
