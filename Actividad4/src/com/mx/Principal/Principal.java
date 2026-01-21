package com.mx.Principal;
	
	import com.mx.Entidades.Pelicula;
	import com.mx.Implementacion.ImpPelicula;

	public class Principal {
		public static void main(String[] args) {

			// Instanciar Películas

			Pelicula p1 = new Pelicula(1, "Avengers Endgame","B","Marvel","Acción");
			Pelicula p2 = new Pelicula(2, "Titanic","B","Paramount","Drama");
			Pelicula p3 = new Pelicula(3, "Toy Story","A","Pixar","Animación");
			Pelicula p4 = new Pelicula(4, "El Conjuro","C","Warner", "Terror");
			Pelicula p5 = new Pelicula(5, "Interestelar","B","Warner","Ciencia Ficción");

			// auxiliar
			Pelicula auxP = null;

			// implementación
			ImpPelicula impP = new ImpPelicula();

			// agregar
			impP.create(p1);
			impP.create(p2);
			impP.create(p3);
			impP.create(p4);
			impP.create(p5);

			// eliminar
			impP.delete(p4);

			// leer
			impP.read();

			// buscar
			auxP = (Pelicula) impP.search(p1);
			System.out.println("Encontrada: " + auxP);

			// contar
			System.out.println(impP.contarPeliculas());

		}
	}



