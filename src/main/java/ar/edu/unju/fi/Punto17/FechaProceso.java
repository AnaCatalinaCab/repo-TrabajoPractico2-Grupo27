package ar.edu.unju.fi.Punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FechaProceso {
	private LocalDate fecha1;
	private LocalDate fecha2;
	private LocalTime time1;
	private LocalTime time2;
	private LocalDateTime dateTime1;
	private LocalDateTime dateTime2;
	
	public FechaProceso() {
		// vacio
	}
	
	public FechaProceso(LocalDate fecha1, LocalDate fecha2) {
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}
	public FechaProceso(LocalTime time1, LocalTime time2) {
		this.time1 = time1;
		this.time2 = time2;
	}
	public FechaProceso(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}

	public LocalDate getFecha1() {
		return fecha1;
	}
	public void setFecha1(LocalDate fecha) {
		this.fecha1 = fecha;
	}

	public LocalDate getFecha2() {
		return fecha2;
	}
	public void setFecha2(LocalDate fecha) {
		this.fecha2 = fecha;
	}

	public LocalTime getTime1() {
		return time1;
	}
	public void setTime1(LocalTime time) {
		this.time1 = time;
	}

	public LocalTime getTime2() {
		return time2;
	}
	public void setTime2(LocalTime time) {
		this.time2 = time;
	}

	public LocalDateTime getDataTime1() {
		return dateTime1;
	}
	public void setTime1(LocalDateTime dateTime) {
		this.dateTime1 = dateTime;
	}

	public LocalDateTime getDataTime2() {
		return dateTime2;
	}
	public void setTime2(LocalDateTime dateTime) {
		this.dateTime2 = dateTime;
	}
	
	public void incrementarHorasATime1(int horas) {
		this.time1 = this.time1.plusHours(horas);
	}
	public void decrementarMinutosATime2(int minutos) {
		this.time2 = this.time2.minusMinutes(minutos);
	}
	
	public Period contarTiempoTranscurrido() {
		return Period.between(fecha1, fecha2);
	}
	
	public String formatearFecha(LocalDate fecha){
		  DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		  return fecha.format(formato);
	}
	
	public String formatearFecha1(){
		  DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		  return fecha1.format(formato);
	}
	
	public String formatearFecha2(){
		  DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		  return fecha2.format(formato);
	}
	
	public String compararFechas() {
		int resultado;
		resultado = this.fecha1.compareTo(fecha2);
		if (resultado > 0) {
			return "La fecha fecha1 es posterior a la fecha fecha2";			
		}else if (resultado < 0) {
			return "La fecha1 es anterior a la fecha2";			
		}else {
			return "Las fecha1 y fecha2 son iguales";
		}
	}

}