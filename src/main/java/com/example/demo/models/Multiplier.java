package com.example.demo.models;

public class Multiplier {
	int num1; 
	double num2;
	
	public Multiplier(int first, double second) {
		num1 = first;
		num2 = second;
	}
		
	public Double product() {
		Double result = num1 * num2;
		return result;
	}
}
