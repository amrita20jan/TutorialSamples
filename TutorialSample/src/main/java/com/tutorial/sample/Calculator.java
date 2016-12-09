package com.tutorial.sample;

public class Calculator {
	private Calculator(){
		System.out.println("Calculator->Calculator()");
	}
	public int add (int a, int b){
		return a+b;
	}
	
	public int divide (int a, int b){
		return a/b;
	}
	
	public String appendHi(int a, int b) { 
		int x=add(a, b);
		return x+"Hi";
	}
}
