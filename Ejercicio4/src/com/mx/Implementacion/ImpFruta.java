package com.mx.Implementacion;

//para realizar una herencia de metodos, se utiliza la palabra reservada 'extends'

public class ImpFruta extends ImpGenerica {
	
	
	//metodo personalkizado
	
	public String contar() {
		return "El hashMap contiene" + hash.size() + "frutas";
	}
	

}
