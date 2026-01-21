package com.mx.Implementacion;

public class ImpEmpleado extends ImpGenerica{
	
	public String contarEmpleados() {
		if (lista.isEmpty()) {
			return "La lista de empleados está vacía";
		}
		return "La lista contiene " + lista.size() + " empleados";
	}	

}
