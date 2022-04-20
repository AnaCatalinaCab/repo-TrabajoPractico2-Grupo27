package Punto13;

import java.time.LocalDate;

public class Empleado {
	String nombre;
	LocalDate fechaIngreso;
	int legajo;
	String email;
	int sueldo;
	int horasTrabajadas;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
		if( this.horasTrabajadas <= 160) {
			this.sueldo = 600;
		}else {
			this.sueldo = 650;
		}
	}
	public Empleado(String nombre, LocalDate fechaIngreso, int legajo, String email, int sueldo, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.legajo = legajo;
		this.email = email;
		this.sueldo = sueldo;
		this.horasTrabajadas = horasTrabajadas;
	}
	public Empleado() {
		super();
	}
	
	
	public Empleado(String nombre, int legajo, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.horasTrabajadas = horasTrabajadas;
		this.fechaIngreso = LocalDate.of(1900, 01, 01);
	}
	public Empleado(String nombre, LocalDate fechaIngreso, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.horasTrabajadas = horasTrabajadas;
		this.legajo = -9999;
	}
	
	
	public Empleado(String nombre, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.fechaIngreso = LocalDate.of(1900, 01, 01);
		this.legajo = -9999;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + ", legajo=" + legajo + ", email="
				+ email + ", sueldo=" + sueldo + ", horasTrabajadas=" + horasTrabajadas + "]";
	}
	public int sueldoFinal() {
		return this.horasTrabajadas * this.sueldo;
	}
	
}
