import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeExamples {
	public LocalDate addDay(LocalDate date){
		return date.plusDays(1);
	}
	public LocalDate subtractDay(LocalDate date){
		return date.minusDays(1);
	}
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		LocalDate ld1 = LocalDate.of(2018, Month.JULY, 27);
		LocalDate ld2 = LocalDate.of(2018, 7, 27);
		LocalTime t1 = LocalTime.of(6, 15);
		LocalTime t2 = LocalTime.of(6,15, 43);
		LocalTime t3 = LocalTime.of(6, 15,43, 210);
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(ld1, t1);
		LocalDate.of(2017, Month.MARCH, 23);
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(ld1);
		System.out.println(ld2);
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);
		date =date.plusWeeks(3);
		System.out.println(date);
		date = date.plusMonths(2);
		System.out.println(date);
		date = date.plusYears(5);
		System.out.println(date);
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY,20);
		LocalTime time1 = LocalTime.of(5, 15);
		LocalDateTime dateTime3 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime3);
		dateTime3=dateTime3.minusDays(1);
		System.out.println(dateTime3);
		dateTime3=dateTime3.minusHours(10);
		System.out.println(dateTime3);
		dateTime3 = dateTime3.minusSeconds(30);
		System.out.println(dateTime3);
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time3 = LocalTime.of(5, 15);
		LocalDateTime dateTime4 = LocalDateTime.of(date3, time3).minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dateTime4);
		LocalDate date11 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date11, time);
		DateTimeFormatter shortF = DateTimeFormatter
		.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter
		.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
		System.out.println(mediumF.format(dateTime));
		
		
	}

}
