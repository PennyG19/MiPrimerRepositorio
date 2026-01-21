package com.mx.Escuela;

import com.mx.Escuela.ImpEscuela;
import com.mx.Escuela.Escuela;

public class Principal {

	public static void main(String[] args) {
		
		Escuela E1 = new Escuela(111111, "Colegio Juárez", "María González", "Primaria", 1200.50);
		Escuela E2 = new Escuela(222222, "Instituto Tecnológico", "Carlos Rodríguez", "Secundaria", 1850.75);
		Escuela E3 = new Escuela(333333, "Centro Educativo Maya", "Ana Martínez", "Preescolar", 950.00);
		Escuela E4 = new Escuela(444444, "Preparatoria Federal", "Roberto Sánchez", "Bachillerato", 2200.00);
		Escuela E5 = new Escuela(555555, "Escuela Nueva Era", "Laura Fernández", "Primaria", 1350.25);
		Escuela E6 = new Escuela(666666, "Colegio del Valle", "Pedro Ramírez", "Secundaria", 1750.50);
		Escuela E7 = new Escuela(777777, "Jardín de Niños Alegría", "Sofía Castro", "Preescolar", 850.75);
		Escuela E8 = new Escuela(888888, "Instituto Politécnico", "Jorge Vargas", "Bachillerato", 2450.00);
		//Objeto auxiliar
		Escuela auxEscuela =null;
		
		//Instanciar implementacion
		
		ImpEscuela imp = new ImpEscuela();
		
		//guardar elementos ene el hash
		
		imp.create(E1);
		imp.create(E2);
		imp.create(E3);
		imp.create(E4);
		imp.create(E5);
		imp.create(E6);
		imp.create(E7);
		imp.create(E8);
		
		//mostrar lo que existe en el hash
		
		imp.read();
		
		//buscar 		
		auxEscuela = new Escuela(111111);
		auxEscuela= imp.search(auxEscuela);
		System.out.println("Escuela encontrada:" + auxEscuela); 
		
		//editar
		auxEscuela = new Escuela(333333);
		auxEscuela = imp.search(auxEscuela);
		auxEscuela.setDirector("Sofía Castro");
		imp.update(auxEscuela);
		System.out.println("Escuela actualizada" + auxEscuela);
		
		//eliminar
		auxEscuela = new Escuela(111111);
		imp.delete(auxEscuela);
		System.out.println("Lista Actualizada\n");
		imp.read();
		
		//contar
		imp.contar();
		
	}
}

	

