package com.mx.Implementacion;

public class ImpPelicula extends ImpGenerica{
	
	public String contarPeliculas() {
		if (lista.isEmpty()) {
			return "La lista de películas está vacía";
		}
		return "La lista contiene " + lista.size() + " películas";
	}


}
