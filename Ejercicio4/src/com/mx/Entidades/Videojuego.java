package com.mx.Entidades;

public class Videojuego {
	
	private int codigo;
	private String nombre;
	private String clasificacion;
	private String empresa;
	private String videojuego;
	
	public Videojuego () {
		
	}

	public Videojuego(int codigo, String nombre, String clasificacion, String empresa, String videojuego) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.clasificacion = clasificacion;
		this.empresa = empresa;
		this.videojuego = videojuego;
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

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getVideojuego() {
		return videojuego;
	}

	public void setVideojuego(String videojuego) {
		this.videojuego = videojuego;
	}

	@Override
	public String toString() {
		return "Videojuego [codigo=" + codigo + ", nombre=" + nombre + ", clasificacion=" + clasificacion + ", empresa="
				+ empresa + ", videojuego=" + videojuego + "]\n";
	}
	
	
	
	

}
