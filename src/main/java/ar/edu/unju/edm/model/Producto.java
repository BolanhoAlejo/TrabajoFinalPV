package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Producto {
	private int codigo;
	private String nombre;
	private int precio;
	private boolean estado;
	private int stock;
	private String descripcion;
	private int preciou;
	
	public Producto(int codigo, String nombre, int precio, boolean estado, int stock, String descripcion, int preciou) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.estado = estado;
		this.stock = stock;
		this.descripcion = descripcion;
		this.preciou = preciou;
	}
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getStock() {
		
		return stock;
		
	}
	
	public void setStock(int stock) {
		
		this.stock = stock;
		
	}
	
	public String getDescripcion() {
		
		return descripcion;
		
	}
	
	public void setDescripcion(String descripcion) {
		
		this.descripcion = descripcion;
		
	}

	public int getPreciou() {
		
		return preciou;
		
	}
	
	public void setPreciou(int preciou) {
		
		this.preciou = preciou;
		
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
