package mypayroll.views;

import java.util.Scanner;

import mypayroll.models.Payroll;
import mypayroll.models.PayrollException;

public class PayrollView {
	
	private static Scanner keyboard;

	public static Payroll getMyPayrollData() {
	
		int numberOfWorkingHours = getValidNumberOfWorkingHours();
		double payRatePerHour = getValidPayRatePerHour();
		Payroll myPayroll = new Payroll(numberOfWorkingHours, payRatePerHour);
		
		return myPayroll;
	}

	private static int getValidNumberOfWorkingHours() {
		String txtNumberOfWorkingHours = null;
		int		numberOfWorkingHours = 0;

		boolean isInputDataValid = true;
		
		keyboard = new Scanner(System.in);
		do {
			isInputDataValid = true;
			
			try {
				System.out.println();
				System.out.print("How many hours are you working per week? ");
				txtNumberOfWorkingHours = keyboard.nextLine();
				if (txtNumberOfWorkingHours.isEmpty()) {
					throw new PayrollException(txtNumberOfWorkingHours);
				}
				else {
					numberOfWorkingHours = Integer.parseInt(txtNumberOfWorkingHours);
					if (numberOfWorkingHours < 0){
						throw new PayrollException(numberOfWorkingHours);
					}
				}
			}
			catch (PayrollException e) {
				isInputDataValid = false;
				System.out.println(e.getMessage());
			}
			catch (NumberFormatException e) {
				isInputDataValid = false;
				System.out.println(">>> Error: a positive integer input data is required.");
			}
		} while (isInputDataValid == false);

		return numberOfWorkingHours;
		
	}
	
	private static double getValidPayRatePerHour() {

		String  txtPayRatePerHour = null;
		double 	payRatePerHour = 0.0;
		
		boolean isInputDataValid = true;
		
		keyboard = new Scanner(System.in);
		
		do {
			isInputDataValid = true;
			
			try {
				System.out.println();
				System.out.print("What is your pay rate per hour? ");
				txtPayRatePerHour = keyboard.nextLine();
				if (txtPayRatePerHour.isEmpty()) {
					throw new PayrollException(txtPayRatePerHour);
				}
				else {
					payRatePerHour = Double.parseDouble(txtPayRatePerHour);
					if (payRatePerHour < 0.0){
						throw new PayrollException(payRatePerHour);
					}
				}
			}
			catch (PayrollException e) {
				isInputDataValid = false;
				System.out.println(e.getMessage());
			}
			catch (NumberFormatException e) {
				isInputDataValid = false;
				System.out.println(">>> Error: a positive double input data is required.");
			}
		} while (isInputDataValid == false);
		
		return payRatePerHour;
	}

	public static void displayGrossPay(double grossPay) {
		System.out.println();
		System.out.printf("Your gross pay is $" + "%.2f \n", grossPay);
	}
} // End of Class PayrollView