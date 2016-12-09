package com.java.hr;
 

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeSalaryCalculationTest {

	static EmployeeSalaryCalculation empSalCal = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empSalCal = new EmployeeSalaryCalculation();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
 
	@Test
	public void testPF1() {
		
		double grossSalary = 1500000;
		double percent = 40;
		
		double actualBasicPay = empSalCal.getBasicPay(grossSalary);
		Assert.assertEquals((grossSalary*percent)/100, actualBasicPay,2);
		
		double actualPf = empSalCal.getPFCalculation(actualBasicPay);
		Assert.assertEquals((actualBasicPay*12)/100, actualPf,2);
	}
	
	@Test
	public void testPF2() {
		
		double grossSalary = 1500;
		double percent = 20;
		
		double actualBasicPay = empSalCal.getBasicPay(grossSalary);
		Assert.assertEquals((grossSalary*percent)/100, actualBasicPay,2);
		
		double actualPf = empSalCal.getPFCalculation(actualBasicPay);
		Assert.assertEquals((actualBasicPay*12)/100, actualPf,2);
	}

}
