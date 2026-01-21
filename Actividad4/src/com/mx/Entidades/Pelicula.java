package com.mx.Entidades;

public class Pelicula {

	int codigo; // clave
	private String titulo;
	private String clasificacion;
	private String productora;
	private String genero;

	public Pelicula() {

	}

	public Pelicula(int codigo, String titulo, String clasificacion, String productora, String genero) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.clasificacion = clasificacion;
		this.productora = productora;
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo +
				", clasificacion=" + clasificacion + ", productora=" +
				productora + ", genero=" + genero + "]\n";
	}
}
