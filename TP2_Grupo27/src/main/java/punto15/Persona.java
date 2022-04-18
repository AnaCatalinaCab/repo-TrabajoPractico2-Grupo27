package punto15;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Persona {

	public Persona() {
		LocalDate fechaNacimiento = LocalDate.of(1998, Month.APRIL, 20);
		String nombre= "ana cabrera";
		System.out.println("Tu nombre es: " + nombre + " tu edad es de " +
				  ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now()) + " años.");
		
	}
}
