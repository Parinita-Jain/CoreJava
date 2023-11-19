package stringanddate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI {
	public static void main(String[] args) {		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		//to print the date in the different format
		//1. Create the pattern/format for the date
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MMMM/yyyy Q eeee");	
		
		//2. Apply this pattern/format on the date
		String formattedDate = date.format(pattern);
		System.out.println(formattedDate);
		
		int month = today.getMonthValue();
		System.out.println(month);
		
		ZonedDateTime zoned = ZonedDateTime.now();
		System.out.println(zoned);
		
		ZoneId paris = ZoneId.of("Europe/Paris");
		ZonedDateTime parisDT = ZonedDateTime.now(paris);
		System.out.println(parisDT);
		
		//LocalDateTime newDate = today.plus(2, ChronoUnit.WEEKS);
		LocalDateTime newDate = today.minus(2, ChronoUnit.DAYS);
		System.out.println(newDate);		
		
	}
}
