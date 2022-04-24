package ar.edu.unju.fi.Punto15;

public class Punto15{
	public static void main(String[] args) {
		Persona nuevaPersona = new Persona();
		nuevaPersona.setNombre("Julian Alvarez");
		nuevaPersona.setFechaNacimiento("28/03/1990");
		System.out.println("Nombre: "+nuevaPersona.getNombre());
		System.out.println("Fecha de nacimiento: "+nuevaPersona.getFechaNacimiento());
		System.out.println("Edad: "+nuevaPersona.calcularEdad());
		System.out.println("Signo del zodiaco: "+nuevaPersona.signoZodiaco());
		System.out.println("Estacion de nacimiento: "+nuevaPersona.estacionDeNacimiento());
	}
}
