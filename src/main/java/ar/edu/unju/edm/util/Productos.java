package ar.edu.unju.edm.util;

import java.util.List;
import java.util.ArrayList;
import ar.edu.unju.edm.model.Producto;

public class Productos {
	private static List <Producto> listadoDeProductos= new ArrayList<>();
	
	public Productos(){
		
	}

	public static List<Producto> getListadoDeProductos() {
		return listadoDeProductos;
	}

	public void setListadoDeProductos(List<Producto> listadoDeProductos) {
		this.listadoDeProductos = listadoDeProductos;
	}
	
}
