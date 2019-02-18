/*
 * John Dow is working  x hours per week.
 * He is being paid by $y per hour.
 * Calculate his weekly gross pay.
 */

 package mypayroll;
 
import java.util.Scanner;

public class Payroll {

	private static Scanner keyboard;

	public static void main(String[] args) {
		int    numberOfWorkingHours;
		double payRatePerHour;
		double grossPay = 0.0;

		keyboard = new Scanner(System.in);
		
		System.out.print("How many hours are you working per week? ");
		numberOfWorkingHours = Integer.parseInt(keyboard.nextLine());
		
		System.out.print("What si your pay rate per hor? ");
		payRatePerHour = Double.parseDouble(keyboard.nextLine());

		grossPay = numberOfWorkingHours * payRatePerHour;
		System.out.printf("Your gross pay is $" + "%.2f \n", grossPay);
	}
}