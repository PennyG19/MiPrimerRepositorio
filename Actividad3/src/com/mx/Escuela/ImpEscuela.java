package com.mx.Escuela;

import java.util.HashMap;

public class ImpEscuela implements IMetodosEscuela{

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
	HashMap<Integer, Escuela> hash = new HashMap<Integer, Escuela>();
	
	
	@Override
	public void create(Escuela escuela) {
		hash.put(escuela.getCCT(),escuela);
		
	}

	@Override
	public void read() {
		System.out.println(hash);
		
	}

	@Override
	public void update(Escuela escuela) {
		//hashmap no ofrece como tal un metodo de editar, pero el put, no permite valores duplicados
		//se utiliza por que cuando identifica una clave identica, reemplaza los valores anteriores
		//dejando la clave igual
		
		hash.put(escuela.getCCT(),escuela);		
	}

	@Override
	public void delete(Escuela escuela) {
		
		hash.remove(escuela.getCCT());	
		
	}

	@Override
	public Escuela search(Escuela escuela) {
		
		return hash.get(escuela.getCCT());
	}
	
	//metodo personalizado
	public void contar() {
		
		System.out.println("El hasch contiene"+ hash.size() + "escuelas registradas");
	}	


}
