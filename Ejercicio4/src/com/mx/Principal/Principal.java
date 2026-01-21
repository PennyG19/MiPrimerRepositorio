package com.mx.Principal;

import com.mx.Entidades.Fruta;
import com.mx.Implementacion.ImpFruta;

public class Principal {
	public static void main (String[] args) {
	
		
		//Intanciar Fruta
		
		Fruta f1 = new Fruta ("Mango", "Amarillo", 1,35,"Verano");
		Fruta f2 = new Fruta ("Piña", "Amarillo", 1,50,"Verano");
		Fruta f3 = new Fruta ("Kiwi", "Verde", 1,45,"Verano");
		Fruta f4 = new Fruta ("Melon", "Naranja", 1,75,"Verano");
		Fruta f5 = new Fruta ("Manzana", "Rojo", 3,24,"Verano");
		Fruta f6 = new Fruta ("Fresa", "Rojo", 1,60,"Verano");
		Fruta f7 = new Fruta ("Sandia", "Roja", 2,42,"Verano");
		
		//auxiliar
		
		Fruta auxF = null;
		
		//implementacion
		ImpFruta impF = new ImpFruta();
		
		//agregar
		
		impF.create(f1.getNombre(), f1);
		impF.create(f2.getNombre(), f2);
		impF.create(f3.getNombre(), f3);
		impF.create(f4.getNombre(), f4);		
		impF.create(f5.getNombre(), f5);
		impF.create(f6.getNombre(), f6);
		impF.create(f7.getNombre(), f7);		
		
		//eliminar
		
		impF.delete(f4.getNombre());
		impF.read();
		//buscar
		//casteo: cambio de datos
		impF.read();
		auxF = (Fruta) impF.search(f1.getNombre());
		System.out.println("Encontrada:" + auxF);

        //contar
		impF.contar();
		
		//replicar el uso de las clases genericas como en el ejemplo de la clase
		//pero usando la una lista
		
		
		
	}	

}
