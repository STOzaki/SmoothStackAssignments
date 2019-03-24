package day5;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class DateTimeApi {
	private static void listOfDays(int year) {
		for(int i = 1; i < 13; i++) {
			System.out.println("Year: " + year + " and month " + i + " had " + YearMonth.of(year, i).lengthOfMonth()
					+ " days.");
		}
	}
		
	private static void mondaysOfMonth(int month) {
		Month monthRange = Month.of(month);
		
		LocalDate currentMonday = Year.now().atMonth(monthRange).atDay(1);
		if(currentMonday.getDayOfWeek() != DayOfWeek.MONDAY) {
			currentMonday = currentMonday.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		}
		Month currentMonth = currentMonday.getMonth();
		while(monthRange == currentMonth) {
			System.out.println(currentMonday);
			currentMonday = currentMonday.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			currentMonth = currentMonday.getMonth();
		}
	}
	
	private static void fridaySpook(LocalDate testDate) {
		if(testDate.getDayOfWeek() == DayOfWeek.FRIDAY && testDate.getDayOfMonth() == 13) {
			System.out.println("That is a date that is on Friday the 13th!!");
		} else {
			System.out.println("I am sorry, but that date does not occur on Friday the 13th");
		}
	}
	
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDate date = LocalDate.now();
		System.out.printf("Last Thursday: %s%n", date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));
		
		// print a list of days of the year
		System.out.println("Reporting the length of each month within a given year");
		listOfDays(2019);
		
		
		// print a list of Monday for a given month
		System.out.println("Lists all of the Mondays in a given month(current year)");
		mondaysOfMonth(4);
		
		// test if the date is Friday the 13th
		LocalDate testTrueDate = LocalDate.of(2019, 9, 13);
		fridaySpook(testTrueDate);
		
		LocalDate testFalseDate = LocalDate.parse("2019-04-13");
		fridaySpook(testFalseDate);
		
		LocalDate testFalseDate1 = LocalDate.parse("2019-03-29");
		fridaySpook(testFalseDate1);
	}

}
