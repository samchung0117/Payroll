/*
 * Discover the use case.
 * Do functional decomposition with the Input-Output-Process (IPO) pattern.
 * Use MVC Architecture with object-oriented decomposition 
 * Implement a new use case.
 * Update the MVC Architecture with object-oriented decomposition 
 * Conduct unit testing.
 * 
 * Validate input data validation with abuse cases
 */
package mypayroll.controllers;

import mypayroll.models.Payroll;
import mypayroll.views.PayrollView;

public class PayrollController {

	public static void main(String[] args) {
		
		// Get my payroll data - the number of working hours and the current pay rate per hour
		// Invalid data are entered.
		Payroll myPayroll = PayrollView.getMyPayrollData();
		
		// Calculate the gross pay 
		// gross pay = the number of working hours *  the current pay rate per hour
		// $1002.40 = 40 hours * $25.06 per hour
		double grossPay = myPayroll.calculateGrossPay();
		
		// Display the calculated gross pay
		 PayrollView.displayGrossPay(grossPay);
		
	}
} // End of Class PayrollControllers