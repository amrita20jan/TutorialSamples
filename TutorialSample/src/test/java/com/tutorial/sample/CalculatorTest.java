package com.tutorial.sample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp"); 
		}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	/*@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		int sum = cal.add(2, 3);
		assertEquals(sum, 5);
	}
	
	@Test
	public void testDivideSuccess() {
		Calculator cal = new Calculator();
		int a = cal.divide(2, 2);
		assertEquals(a, 1);
	}
	
	
	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		Calculator cal = new Calculator();
		cal.divide(2, 0);
	}*/
	
	/*@Test
	public void testMock() {
		Calculator cal = Mockito.mock(Calculator.class);
		Mockito.when(cal.add(2,6)).thenReturn(8);
		Mockito.when(cal.appendHi(2,6)).thenCallRealMethod(); 
		assertEquals("8Hi", cal.appendHi(2, 6));
		
		Mockito.verify(cal).add(2, 6);
		
	}*/

}
