package com.mx.Implementacion;

import java.util.ArrayList;
import java.util.List;

public class ImpGenerica {
	
	protected List<Object> lista = new ArrayList<Object>();

	
	public void create(Object obj) {
		if (!lista.contains(obj)) {
			lista.add(obj);
			System.out.println("Registro agregado correctamente");
		} else {
			System.out.println("El registro ya existe, no se puede duplicar");
		}
	}

	
	public void read() {
		if (lista.isEmpty()) {
			System.out.println("La lista está vacía");
		} else {
			for (Object obj : lista) {
				System.out.println(obj);
			}
		}
	}

	
	public void update(Object obj) {
		int index = lista.indexOf(obj);

		if (index != -1) {
			lista.set(index, obj);
			System.out.println("Registro actualizado correctamente");
		} else {
			System.out.println("El registro no existe, no se puede actualizar");
		}
	}

	
	public void delete(Object obj) {
		if (lista.remove(obj)) {
			System.out.println("Registro eliminado correctamente");
		} else {
			System.out.println("El registro no existe, no se puede eliminar");
		}
	}

	
	public Object search(Object obj) {
		int index = lista.indexOf(obj);

		if (index != -1) {
			return lista.get(index);
		} else {
			System.out.println("Registro no encontrado");
			return null;
		}
	}
}


