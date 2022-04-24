package ar.edu.unju.fi.Punto15;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento()	{
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento)	{
		DateTimeFormatter formato;
		formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaNacimiento= LocalDate.parse(fechaNacimiento,formato);
	}
	
	public int calcularEdad() {
		LocalDate fechaHoy = LocalDate.now();
		return Period.between(this.fechaNacimiento, fechaHoy).getYears();
	}
	
	public String signoZodiaco() {
		/*Muestra el signo de acuerdo a la fecha de nacimiento
		 *las fechas se obtuvieron del siguiente link:
		 *http://www.gaiaciencia.com/wp-content/uploads/2016/11/Captura-de-pantalla-2016-11-25-a-las-23.31.57.png
		 *si es un año bisiesto le 1 con la variable: bisiesto para compensar la diferencia de un dia,
		 *si no es en año bisiesto la variable bisiesto queda en 0*/
		int diaDelAnio = this.fechaNacimiento.getDayOfYear();//Obtengo el dia de 1 a 365 dias
		int bisiesto = this.fechaNacimiento.isLeapYear()?1:0;//Si es un año bisiesto le asigno 1 
		if ((diaDelAnio >= 21)&&(diaDelAnio <= 50)) {
			return "Acuario";
		}else if((diaDelAnio >= 51)&&(diaDelAnio <= (79+bisiesto))){
			return "Piscis";
		}else if((diaDelAnio >= (80+bisiesto))&&(diaDelAnio <= (110+bisiesto))){
			return "Aries";
		}else if((diaDelAnio >= (111+bisiesto))&&(diaDelAnio <= (140+bisiesto))){
			return "Tauro";
		}else if((diaDelAnio >= (141+bisiesto))&&(diaDelAnio <= (171+bisiesto))){
			return "Geminis";
		}else if((diaDelAnio >= (172+bisiesto))&&(diaDelAnio <= (203+bisiesto))){
			return "Cancer";
		}else if((diaDelAnio >= (204+bisiesto))&&(diaDelAnio <= (234+bisiesto))){
			return "Leo";
		}else if((diaDelAnio >= (235+bisiesto))&&(diaDelAnio <= (265+bisiesto))){
			return "Virgo";
		}else if((diaDelAnio >= (266+bisiesto))&&(diaDelAnio <= (293+bisiesto))){
			return "Libra";
		}else if((diaDelAnio >= (294+bisiesto))&&(diaDelAnio <= (325+bisiesto))){
			return "Escorpio";
		}else if((diaDelAnio >= (326+bisiesto))&&(diaDelAnio <= (355+bisiesto))){
			return "Sagitario";
		}else if((diaDelAnio >= (356+bisiesto))||(diaDelAnio <= 20)){
			return "Capricornio";
		}else {
			return "Esto no deberia pasar! Pero no se encotro el signo";
		}
	}
	
	public String estacionDeNacimiento() {
		int diaDelAnio = this.fechaNacimiento.getDayOfYear();//Obtengo el dia de 1 a 365 dias
		int bisiesto = this.fechaNacimiento.isLeapYear()?1:0;//Si es un año bisiesto le asigno 1 
		if ((diaDelAnio >= 80)&&(diaDelAnio <= 171+bisiesto)) {
			return "Otoño";
		}else if((diaDelAnio >= 172+bisiesto)&&(diaDelAnio <= (263+bisiesto))){
			return "Invierno";
		}else if((diaDelAnio >= (264+bisiesto))&&(diaDelAnio <= (354+bisiesto))){
			return "Primavera";
		}else if((diaDelAnio >= (355+bisiesto))||(diaDelAnio <= (79+bisiesto))){
			return "Verano";
		}else {
			return "Esto no deberia pasar! Pero no se encotro la Estacion";
		}
	}

}