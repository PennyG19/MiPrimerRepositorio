package com.mx.Alumno;

public class Alumno {
	
	    // DECLARACIÓN DE LOS ATRIBUTOS
	    private String nombre;
	    private String apellidoPaterno;
	    private String apellidoMaterno;
	    private int edad;
	    private String matricula;

	    // CONSTRUCTOR POR DEFECTO
	    public Alumno() {
	    }

	    // CONSTRUCTOR CON PARÁMETROS
	    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String matricula) {
	        this.nombre = nombre;
	        this.apellidoPaterno = apellidoPaterno;
	        this.apellidoMaterno = apellidoMaterno;
	        this.edad = edad;
	        this.matricula = matricula;
	    }

	    // GETTERS Y SETTERS

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellidoPaterno() {
	        return apellidoPaterno;
	    }

	    public void setApellidoPaterno(String apellidoPaterno) {
	        this.apellidoPaterno = apellidoPaterno;
	    }

	    public String getApellidoMaterno() {
	        return apellidoMaterno;
	    }

	    public void setApellidoMaterno(String apellidoMaterno) {
	        this.apellidoMaterno = apellidoMaterno;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public String getMatricula() {
	        return matricula;
	    }

	    public void setMatricula(String matricula) {
	        this.matricula = matricula;
	    }

	    // MÉTODO toString
	    @Override
	    public String toString() {
	        return "Alumno [nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno +
	               ", edad=" + edad + ", matricula=" + matricula + "]\n";
	    }
	}


