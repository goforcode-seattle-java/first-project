package com.example.demo.models;

public class Modulus {
	int num1;
	double num2;
	
	public Modulus(int first, double second) {
		num1 = first;
		num2 = second;
	}

	Modulus defaultModulus = new Modulus(num1, num2);
	
	public Double remainder() {
		Double result = num1 % num2;
		return result;
	}
}
