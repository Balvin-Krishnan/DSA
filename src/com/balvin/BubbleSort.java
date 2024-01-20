package com.balvin;

import java.util.Iterator;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {6,5,2,8,9,4};
		
		
		System.out.println("Before Sorting");
		for (int i : nums) {
			System.out.print(i);
		}
		
		int temp = 0;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j+1];
					nums[j+1] = nums[j];
					nums[j]=temp;
				}
			}
			
		}
		
		System.out.println();
		System.out.println("After Sorting");
		for (int i : nums) {
			System.out.print(i);
		}

	}

}
