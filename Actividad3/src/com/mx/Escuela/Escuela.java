package com.mx.Escuela;

public class Escuela {
	
	private int CCT; //clave
	private String nombre;
	private String director;
	private String nivel;
	private double colegiatura;
	
	public Escuela() {
		
	}

	public Escuela(int cCT, String nombre, String director, String nivel, double colegiatura) {	
		
		CCT = cCT;
		this.nombre = nombre;
		this.director = director;
		this.nivel = nivel;
		this.colegiatura = colegiatura;
	}
	//realizar una sobrecarga de constructores, con uno que nos permita incicializar con un solo valor.
	
		public Escuela(int CCT) {
			this.CCT = CCT;	
			
		}

	

	
	public int getCCT() {
		return CCT;
	}

	public void setCCT(int cCT) {
		CCT = cCT;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getColegiatura() {
		return colegiatura;
	}

	public void setColegiatura(double colegiatura) {
		this.colegiatura = colegiatura;
	}
	
	@Override
	public String toString() {
		return "Escuela [CCT=" + CCT + ", nombre=" + nombre + ", director=" + director + ", nivel=" + nivel
				+ ", colegiatura=" + colegiatura + "]/n";
	}


}
