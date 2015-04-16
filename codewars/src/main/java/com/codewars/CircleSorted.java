package com.codewars;

import org.junit.Assert;

////True:
//isCircleSorted([2,3,4,5,0,1]);
//isCircleSorted([4,5,6,9,1]);
//isCircleSorted([10,11,6,7,9]);
//isCircleSorted([1,2,3,4,5]);
//isCircleSorted([5,7,43,987,-9,0]);
//
//
////False:
//isCircleSorted([4,1,2,5]);
//isCircleSorted([8,7,6,5,4,3]);
//isCircleSorted([6,7,4,8]);
//isCircleSorted([7,6,5,4,3,2,1]);
public class CircleSorted {
	public static void main(String[] args) {
		CircleSorted circleSorted = new CircleSorted();
		
		int[] A = { 3, 0, 1, 2 };
		System.out.println(circleSorted.isCircleSorted(A));
	}
	
    public boolean isCircleSorted(int[] a) {
    	if (a.length < 2) {
    		return true;
    	}
    	
    	int min = a[0];
    	int minIndex = 0;
    	for (int i = 1; i < a.length; i++) {
    		if (a[i] < min) {
    			min = a[i];
    			minIndex = i;
    		}
    	}
    	
    	boolean isSorted = true;
    	int start = minIndex;
    	int previousElement = a[minIndex];
    	
    	for (int i = 1; i < a.length; i++) {
    	    if (a[(i + start) % a.length] < previousElement) {
    	    	isSorted = false;
    	    	break;
    	    }
    	    
    	    previousElement = a[(i + start) % a.length];
    	}
    	
    	return isSorted;
  }
}
