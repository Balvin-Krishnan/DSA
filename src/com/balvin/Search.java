package com.balvin;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {5,7,9,11,13};
		int target = 11;
		
		//Linear Search
		int result1 = linearSearch(nums, target);
		System.out.println(result1);
		//Binary Search
		int result2 = binarySearch(nums, target, 0, nums.length);
		System.out.println(result2);

	}
	
	public static int linearSearch(int nums[], int target) {
		int result=0;
		for(int num: nums) {
			if(num < target) {
				result++;
			}
		}
		return result;
	}

	public static int binarySearch(int nums[], int target, int left, int right) {
		//5,7,9,11,13
		
		if(left<=right) {
			int mid = (left+right)/2;
			
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid]<target) {
				binarySearch(nums, target, mid+1, right);
			}else {
				binarySearch(nums, target, left, mid-1);
			}
		}		
		
		return -1;
	}
}
