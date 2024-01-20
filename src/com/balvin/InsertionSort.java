package com.balvin;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {6,3,8,2,9,4};
		int key = 0;
		int j = 0;
		
		//i, j, key
		
		for (int i = 1; i < nums.length; i++) {
			
			key = nums[i];
			j = i-1;
			while(j>=0 && nums[j]>key) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
		}
		
		for (int i : nums) {
			System.out.print(i);
		}
	}

}
