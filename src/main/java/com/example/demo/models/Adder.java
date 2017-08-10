package com.example.demo.models;

public class Adder {
	int num1;
	double num2;
	
	public Adder(int first, double second) {
		num1 = first;
		num2 = second; 
	}
	
	Adder defaultAdder = new Adder(num1, num2);
	
	public Double sum() {
	 	Double result = num1 + num2;
	 	return result;
	}
	

}
