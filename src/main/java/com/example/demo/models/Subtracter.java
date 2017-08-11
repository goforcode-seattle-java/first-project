package com.example.demo.models;

public class Subtracter {
	int num1;
	double num2;
	
	public Subtracter(int first, double second) {
		num1 = first;
		num2 = second;
	}
	
	public Double difference() {
		Double result = num1 - num2;
		return result;
	}
}
