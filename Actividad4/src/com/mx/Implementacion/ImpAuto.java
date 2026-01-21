package com.mx.Implementacion;

import com.mx.Entidades.Auto;

public class ImpAuto extends ImpGenerica{
	
	public String contarEmpleados() {
		if (lista.isEmpty()) {
			return "La lista de empleados está vacía";
		}
		return "La lista contiene " + lista.size() + " empleados";
	}

	

}
