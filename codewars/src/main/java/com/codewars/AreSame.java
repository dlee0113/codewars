package com.codewars;

import java.util.Arrays;

public class AreSame {
	public static void main(String[] args) {
	
	}

	public static boolean comp(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
		
		if (a.length != b.length) {
			return false;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (int i = 0; i < a.length; i ++) {
			if (a[i] * a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
}
