package com.mx.Alumno;
//para implementar una interfaz se ocupa la palabra reservad "implements"

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IAlumnos{
	

	//declaracion de una lista para agregar un comportamiento a los metodos declarados
	
	List<Alumno> lista =new ArrayList<Alumno>();
	
	@Override 
	public void create(int indice, Alumno alumno) {
		
		lista.add(alumno);
		
	}

	@Override //sobre escritura de metodos, cambia el comportamiento inicial de un metodo
	public void read() {
                System.out.println(lista);
	}

	@Override
	public void update(int indice, Alumno alumno) {
		lista.set(indice, alumno);
	
		
	}

	@Override
	public void delete(int indice) {
		lista.remove(indice);
		
	}

	@Override
	public Alumno buscar(int indice) {
		
		return lista.get(indice);
	}
	
	//metodos personalizados
	
	public void contar() {
		
		System.out.println("Existen" + lista.size() + "alumnos registrados");
	}
	       
	
}

	
	
	
	


