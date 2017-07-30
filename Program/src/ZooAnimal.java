import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ZooAnimal {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LocalDate start = LocalDate.of(2017, Month.JULY, 1);
//		LocalDate end = LocalDate.of(2017, Month.DECEMBER, 30);
//		performAnimalEnrichment(start, end);
//
//	}
//	private static void performAnimalEnrichment(LocalDate start, LocalDate end){
//		LocalDate upto = start;
//		while(upto.isBefore(end)){
//		System.out.println("give my toy:"+upto);
//		upto=upto.plusMonths(1);
//		}
//		
//	}
	
//	public static void main(String[] args) throws Exception {
//		LocalDate start = LocalDate.of(2017,Month.JULY, 1);
//	LocalDate end = LocalDate.of(2017, Month.DECEMBER, 30);
//		Period period = Period.ofMonths(1);
//		performAnimalEnrichment(start, end, period);
//}
//	private static  String performAnimalEnrichment(LocalDate start, LocalDate end,Period period){
//		LocalDate upTo = start;
//		while(upTo.isBefore(end)){
//			System.out.println("give my toy:"+upTo);
//			upTo = upTo.plus(period);
//		}
//		return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(start);
//		
//	}
//	public static void main(String[] args) {
		//Period period= Period.ofYears(1).ofWeeks(1);
		//System.out.println(period);
//		Period wrong = Period.ofYears(1);
//		wrong = Period.ofWeeks(1);
//		System.out.println(wrong);
//		LocalTime time  = LocalTime.of(7, 24,45);
//		Period period = Period.ofMonths(1);
//		System.out.println(time.plus(period));
		
//		LocalDate date = LocalDate.of(2020, Month.MARCH, 23);
//		System.out.println(date.getDayOfWeek()); 
//		System.out.println(date.getMonth()); 
//		System.out.println(date.getYear()); 
//		System.out.println(date.getDayOfYear());
		
		
//		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//	LocalTime time = LocalTime.of(11, 12, 34);
//		LocalDateTime dateTime = LocalDateTime.of(date, time);
////		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
////		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
////		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
//		
//		
//		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//		System.out.println(shortDateTime.format(dateTime));
//		System.out.println(shortDateTime.format(date));
//		System.out.println(shortDateTime.format(time));
	public static void main(String[] args) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2015", f);
		LocalTime time = LocalTime.parse("11:22");
		System.out.println(date);
		System.out.println(time);
	}
	
//		
	}

	
	

	


