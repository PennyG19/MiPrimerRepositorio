package com.mx.Libro;

import java.util.HashMap;

public class ImpLibro  implements IMetodosLibro{

	/*Declaracion del HashMap
	 * SINTAXIS
	 * HashMp<Clave, Valor> hash = new HashMap<Clave, Valor>();
	 * 
	 * HashMap--> es una libreria de java.util
	 * <> -> se le conoce como operador diamante
	 * Clave(KeyDateType) -> clase contenedora del dato primitivo de mi clave
	 * Valor(ValueDataType) -> el nombre de la clase
	 * nombre(hash)-> definido por programador
	 * new -> palabra reservada para invocar al constructor y lo llama por defecto
	 * 
	 * */
	
	//declarar el hashmap para el objeto libro	
	HashMap<Integer, Libro> hash = new HashMap<Integer, Libro>();
	
	
	@Override
	public void create(Libro libro) {
		hash.put(libro.getIsbn(),libro);
		
	}

	@Override
	public void read() {
		System.out.println(hash);
		
	}

	@Override
	public void update(Libro libro) {
		//hashmap no ofrece como tal un metodo de editar, pero el put, no permite valores duplicados
		//se utiliza por que cuando identifica una clave identica, reemplaza los valores anteriores
		//dejando la clave igual
		
		hash.put(libro.getIsbn(),libro);		
	}

	@Override
	public void delete(Libro libro) {
		
		hash.remove(libro.getIsbn());	
		
	}

	@Override
	public Libro search(Libro libro) {
		
		return hash.get(libro.getIsbn());
	}
	
	//metodo personalizado
	public void contar() {
		
		System.out.println("El hasch contiene"+ hash.size() + "libros registrados");
	}
	

}
