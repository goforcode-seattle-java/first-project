package com.example.demo.models;

public class Exponent {
	int num1;
	double num2;

	public Exponent(int first, double second) {
		num1 = first;
		num2 = second;
	}
	
	public Double power() {
		Double result = Math.pow(num1, num2);
		return result;
	}

}
