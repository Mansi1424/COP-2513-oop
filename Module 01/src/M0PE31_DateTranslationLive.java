
/*
   REQUIREMENTS
   
	Write a program that inputs from the user three integer values.
	
	The first one will correspond to the number of the month.
	Any input outside of [1..12] will cause the program to display
	an error message and prompt the user to enter a correct value.
	
	The second one will correspond to the day of the week [1..7] with
	1 standing for monday.
	
	The third will simply be the date in the month. It should, for now,
	always be within [1..31] regardless of the month that has been selected.
   
	Your program will take this data and display on the console the date
	in a formatted way.
	
	For instance, if the values provided were 8, 1, and 26,
	the program will display;
			
			Monday, 26 of August

	To do so, you will write a static method returning the formatted date
	as a String based on the 3 integer values passed as parameters.
	
	You will then use this method from your main.
   
   OPTIONAL
	-  Make sure that the range of acceptable values for the date
		in the month value is based on the selected month.
		For simplicity, we will assume february to always have 28 days.
	-  Add the year value to the program, then handle leap years.
		See section 3.11, "Case Study: Determining Leap Year", p.97 in textbook.
*/
import java.util.Scanner;

public class M0PE31_DateTranslationLive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the month, day, and year: ");
		int month = input.nextInt();
		int day = input.nextInt();
		int monthDay = input.nextInt();
		System.out.println("The date is  " + dayOfWeek(day) + " " + dayOfMonth(monthDay) + " of " + month(month));
		

	} // end main

	public static String month(int month) {
		String[] months = {"January", "Febuary", "March", "April", "May","June","July","August","September",
				"October","November","December"};
		String theMonth = (months[month - 1]);
		return theMonth;
		}
	
	public static String dayOfWeek(int day) {
		String[] weak = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		String days = (weak[day - 1]);
		return days;

	} //end dayOFWeek method
	
	public static int dayOfMonth(int monthDay) {
		if (monthDay <= 1 || monthDay >= 31 )
		System.out.println("Error: Please enter a day of the month that is 1 to 31 inclusive");
		else {
		System.out.println(" ");
		}
		return (monthDay);
		
	}
	
}