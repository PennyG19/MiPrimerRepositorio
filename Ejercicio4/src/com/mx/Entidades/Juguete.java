package com.mx.Entidades;

public class Juguete {
	
	private Long sku; //clave
	private String nombre; 
	private String material;
	private String empresa;
	private int edades;
	
	public Juguete () {
	}

	public Juguete(Long sku, String nombre, String material, String empresa, int edades) {
		
		this.sku = sku;
		this.nombre = nombre;
		this.material = material;
		this.empresa = empresa;
		this.edades = edades;
	}

	public Long getSku() {
		return sku;
	}

	public void setSku(Long sku) {
		this.sku = sku;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getEdades() {
		return edades;
	}

	public void setEdades(int edades) {
		this.edades = edades;
	}

	@Override
	public String toString() {
		return "Juguete [sku=" + sku + ", nombre=" + nombre + ", material=" + material + ", empresa=" + empresa
				+ ", edades=" + edades + "]/n";
	}	
	
	
}


