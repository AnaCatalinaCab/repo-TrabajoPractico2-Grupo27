package ar.edu.unju.fi.Punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Punto17 {
	public static void main(String[] args) {
		DateTimeFormatter formato;
		formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		/**			b.1)         **/
		System.out.println("Punto 17 b.1)");
		LocalDate fecha1 = LocalDate.parse("15/12/2020",formato);
		LocalDate fecha2 = LocalDate.parse("25/07/2018",formato);
		FechaProceso pf1 = new FechaProceso(fecha1, fecha2);
		System.out.println("fecha1: "+pf1.getFecha1());
		System.out.println("fecha2: "+pf1.getFecha2());
		/**			b.2)         **/
		System.out.println("Punto 17 b.2)");
		LocalTime time1 = LocalTime.parse("05:23:54");
		LocalTime time2 = LocalTime.parse("15:12:04");
		FechaProceso pf2 = new FechaProceso(time1, time2);
		pf2.incrementarHorasATime1(5);
		pf2.decrementarMinutosATime2(20);
		System.out.println("time1: "+pf2.getTime1());
		System.out.println("time2: "+pf2.getTime2());
		/**			b.3)         **/
		System.out.println("Punto 17 b.3)");
		System.out.println("Compara Fechas: "+pf1.compararFechas());
		/**			b.4)         **/
		System.out.println("Punto 17 b.4)");
		LocalDateTime dateTime1 = LocalDateTime.of(pf1.getFecha1(), pf2.getTime1());
		LocalDateTime dateTime2 = LocalDateTime.of(pf1.getFecha2(), pf2.getTime2());
		FechaProceso pf3 = new FechaProceso(dateTime1,dateTime2);
		System.out.println("dateTime1: "+pf3.getDataTime1());
		System.out.println("dateTime2: "+pf3.getDataTime2());
		/**			b.5)         **/
		System.out.println("Punto 17 b.5)");
		FechaProceso pf4 = new FechaProceso(LocalDate.parse("08/09/1981",formato), LocalDate.now());
		System.out.println("Han transcurrido "+pf4.contarTiempoTranscurrido().getYears()
				+" años, "+pf4.contarTiempoTranscurrido().getMonths()
				+" meses y "+pf4.contarTiempoTranscurrido().getDays()
				+" días desde la fecha "+pf4.formatearFecha1()
				+" hasta la fecha "+pf4.formatearFecha2());
		/**			b.6)         **/
		System.out.println("Punto 17 b.6) y b.7)");
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese una fecha con el formato dd/MM/yyyy: ");
		LocalDate fechaIngresada = LocalDate.parse((String) leer.nextLine(), formato);
		FechaProceso pf5 = new FechaProceso();
		pf5.setFecha1(fechaIngresada);
		LocalDate nuevaFecha1 = pf5.getFecha1().plusDays(365);
		System.out.println("La nueva fecha es: "+nuevaFecha1);
		System.out.println("Punto 17 b.6) y b.7)");
		Scanner leer2 = new Scanner(System.in);
		System.out.print("Ingrese una segunda fecha con el formato dd/MM/yyyy: ");
		fechaIngresada = LocalDate.parse((String) leer2.nextLine(), formato);
		pf5.setFecha2(fechaIngresada);
		LocalDate nuevaFecha2 = pf5.getFecha2().minusMonths(6);
		System.out.println("La nueva fecha es: "+nuevaFecha2);
	}
}
