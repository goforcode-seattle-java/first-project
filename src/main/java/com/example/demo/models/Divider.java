package com.example.demo.models;

public class Divider {
	int num1;
	double num2;
	
	public Divider(int first, double second) {
		num1 = first;
		num2 = second;
	}
	
	public Double quotient() {
		Double result = num1 / num2;
		return result;
	}
}
