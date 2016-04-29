package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consecutives {
	public static void main(String[] args) {
		List<Integer> i = Arrays.asList(1,4,4,4,0,4,3,3,1);
		
		System.out.println(sumConsecutives(i));
	}

	public static List<Integer> sumConsecutives(List<Integer> s) {
		List<Integer> sumList =  new ArrayList<Integer>();
		int sum = 0;
		
		for (int i = 0; i < s.size(); i ++) {
			System.out.println(s.get(i));
			
			if (i < s.size() - 1 && s.get(i) == s.get(i + 1)) {
				if (sum == 0) {
					sum = s.get(i) + s.get(i + 1);
				}
				else {
					sum = sum + s.get(i + 1);
				}
			}
			else {
				if (sum == 0) {
					sumList.add(s.get(i));
				}
				else {
					sumList.add(sum);
					sum = 0;
				}
			}
		}
		
		return sumList;
	}
}
