/*
 * Discover the use case.
 * Do functional decomposition with the Input-Output-Process (IPO) pattern.
 * Use MVC Architecture with object-oriented decomposition 
 * 
 * Implement a new use case.
 * Update the MVC Architecture with object-oriented decomposition 
 * 
 */
package mypayroll.controllers;

import mypayroll.models.Payroll;
import mypayroll.views.PayrollView;

public class PayrollController {
	public static void main(String[] args) {
		
		Payroll myPayroll = PayrollView.getMyPayrollData();
		
		double grossPay = myPayroll.calculateGrossPay();
		
		 PayrollView.displayGrossPay(grossPay);
		
	}
} // End of Class PayrollControllers