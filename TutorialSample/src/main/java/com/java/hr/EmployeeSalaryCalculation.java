/**
 * 
 */
package com.java.hr;


/**
 * @author Rahul gupta
 * @version 1.1
 */
public class EmployeeSalaryCalculation {
	
	public double getBasicPay(double grossSal){
		double basicPay;
		if(grossSal > 10000){
			basicPay = (grossSal * 40)/100;
		} else {
			basicPay = (grossSal * 20)/100;
		}
		return basicPay;
	}
	
	public double getPFCalculation(double basicPay){
		double pf = (basicPay * 12)/100;
		return pf;
	}

}
