package com.codewars;

import java.util.Arrays;

public class Rotator {
	public static void main(String[] args) {
		Object[] data = new Object[]{1, 2, 3, 4, 5};
		
		Rotator rotator = new Rotator();
		rotator.rotate(data, -2);
	}

	public Object[] rotate(Object[] data, int n) {
		Object[] mergedData = null;
		
		if (Math.abs(n) == data.length || n == 0) {
			return data;
		}
		
		if (Math.abs(n) > data.length) {
			n = n % data.length;
		}
		
		// rotate forward
		if (n > 0) {
			Object[] frontData = Arrays.copyOfRange(data, data.length - n, data.length);
			Object[] behindData = Arrays.copyOfRange(data, 0, data.length - n);
			
			mergedData = mergeArrays(frontData, behindData);
		}
		// rotate backward
		else if (n < 0) {
			n = Math.abs(n);
			
			Object[] frontData = Arrays.copyOfRange(data, n, data.length);
			Object[] behindData = Arrays.copyOfRange(data, 0, n);
			
			mergedData = mergeArrays(frontData, behindData);
		}
		
		return mergedData;
	}
	
	private Object[] mergeArrays(Object[] frontData, Object[] behindData) {
		Object[] mergedData = new Object[frontData.length + behindData.length];
		int index = 0;
		
		for (Object object : frontData) {
			mergedData[index] = object;
			index ++;
		}
		
		for (Object object : behindData) {
			mergedData[index] = object;
			index ++;
		}
		
		return mergedData;
	}
}
