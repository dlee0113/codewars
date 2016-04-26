package com.codewars;

public class Circle {
	public static double area(double radius) {
		if (radius < 1) {
			throw new IllegalArgumentException();	
		}
		
		return (double) Math.round(Math.PI * radius * radius * 100) / 100;
	}
}
