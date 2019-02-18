package mypayroll.views;

import java.util.Scanner;

import mypayroll.models.Payroll;

public class PayrollView {
	
	private static Scanner keyboard;

	public static Payroll getMyPayrollData() {
		
		int		numberOfWorkingHours = 40;
		double 	payRatePerHour 		 = 25.6;
		
		keyboard = new Scanner(System.in);
		
		System.out.print("How many hours are you working per week? ");
		numberOfWorkingHours = Integer.parseInt(keyboard.nextLine());
		
		System.out.print("What is your pay rate per hour? ");
		payRatePerHour = Double.parseDouble(keyboard.nextLine());
		
		Payroll myPayroll = new Payroll(numberOfWorkingHours, payRatePerHour);
		
		return myPayroll;
	}
	
	public static void displayGrossPay(double grossPay) {
		
		 System.out.printf("Your gross pay is $" + "%.2f \n", grossPay);
		
	}



} // End of Class PayrollView