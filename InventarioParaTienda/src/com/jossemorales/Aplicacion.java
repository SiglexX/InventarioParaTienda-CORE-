package com.jossemorales;

import com.jossemorales.clases.ComputadoraPortatil;
import com.jossemorales.clases.Televisor;
import com.jossemorales.clases.TiendaElectronica;

public class Aplicacion {

	public static void main(String[] args) {
		TiendaElectronica tienda = new TiendaElectronica();
		
		Televisor televisor1 = new Televisor("LG UHD AI UT73", 379990.0, 10, 55, "4k");
		ComputadoraPortatil computadora1 = new ComputadoraPortatil("MSI Katana", 1703511.0, 6, "MSI", 64, "1234abcd");
		
		tienda.agregarProducto(computadora1);
		tienda.agregarProducto(televisor1);
		
		tienda.mostrarProductos();
		
		tienda.realizarVenta("LG UHD AI UT73", 2);
		tienda.realizarVenta("MSI Katana", 1);
		
		tienda.mostrarProductos();
		
		tienda.realizarVenta("MSI Katana", 4);
		
		tienda.realizarVenta("MSI Katana", 1);
		
		tienda.mostrarProductos();
		
		tienda.realizarVenta("MSI Katana", 2);
		
		tienda.mostrarProductos();
		
		tienda.realizarVenta("Samsung", 1);
	}

}
