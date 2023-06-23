package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Producto {
	private int codigo;
	private String nombre;
	private String descripcion;
	private int puntuacion;
	
	public Producto(int codigo, String nombre, String descripcion, int puntuacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.puntuacion = puntuacion;
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
	

	public String getDescripcion() {
		
		return descripcion;
		
	}
	
	public void setDescripcion(String descripcion) {
		
		this.descripcion = descripcion;
		
	}
	
	public int getPuntuacion() {
		
		return puntuacion;
		
	}
	
	public void setPuntuacion(int puntuacion) {
		
		this.puntuacion = puntuacion;
		
	}

	
}
