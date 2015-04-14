package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
	public static void main(String[] args) {
//		System.out.println(Arrays.toString(DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST"})));
		System.out.println(Arrays.toString(DirReduction.dirReduc(
				new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" })));
//		System.out.println(Arrays.toString(DirReduction.dirReduc(new String[] { "NORTH", "WEST", "SOUTH","EAST" })));
		
//		System.out.println(Arrays.toString(DirReduction.dirReduc(
//				new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"})));
	}
	
	public static String[] dirReduc(String[] arr) {
		List<String> intputDirReducArray = new ArrayList<String>();
		for (String direction : arr) {
			if (!direction.equals("")) {
				intputDirReducArray.add(direction);
			}
		}
		
		System.out.println("intputDirReducArray: " + intputDirReducArray);
		
		int reductionCount = 0;
		
		if (arr.length > 0) {
			String currentDirection = arr[0];

			for (int i = 1; i < arr.length; i++) {
				currentDirection = arr[i];
				
				if (currentDirection.equals("NORTH") && arr[i - 1].equals("SOUTH") || 
					currentDirection.equals("SOUTH") && arr[i - 1].equals("NORTH") || 
					currentDirection.equals("WEST") && arr[i - 1].equals("EAST") ||
					currentDirection.equals("EAST") && arr[i - 1].equals("WEST")) {
					arr[i - 1] = "";
					arr[i] = "";
					reductionCount++;
				}
			}
		}

		List<String> dirReducArray = new ArrayList<String>();
		for (String direction : arr) {
			if (!direction.equals("")) {
				dirReducArray.add(direction);
			}
		}
		
		System.out.println("reductionCount: " + reductionCount);
		System.out.println("dirReducArray: " + dirReducArray);
		
		if (reductionCount == 0) {
			return dirReducArray.toArray(new String[dirReducArray.size()]);
		}
		
		return dirReduc(dirReducArray.toArray(new String[dirReducArray.size()]));
	}
}
