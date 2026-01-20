package com.mx.Alumno;
import java.util.List;
public interface IAlumnos {	

	
		public void create(int indice, Alumno alumno);
		
		public void read();
		
		public void update(int indice, Alumno alumno);
		
		public void delete(int indice);
		
		public  Alumno buscar(int indice);
		
	}



