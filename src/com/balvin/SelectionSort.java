package com.balvin;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {6,5,2,8,9,4};
		int temp = 0;
		int minIndex = 0;
		
		System.out.println("before sorting");
		for (int i : nums) {
			System.out.print(i);	
		}
			
		
		for(int i=0; i<nums.length-1; i++) {
			minIndex = i;
			for(int j=i+1; j<nums.length;j++) {
			
				if(nums[j] < nums[minIndex])
					minIndex = j;
			}
			
				temp=nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex]=temp;
			
		
		System.out.println();
		System.out.println("After Sorting");
		for (int h : nums) {
			System.out.print(h);
		}
		}
	}

}
