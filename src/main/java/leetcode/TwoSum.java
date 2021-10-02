package main.java.leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t;
		t  = sc.nextInt();
		int[] nums = new int[t];
		for(int i = 0; i < t; i++) {
			nums[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int[] answer = twoSum(nums, target);
		System.out.println(answer[0] + " " + answer[1]);
		sc.close();
	}

	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> diffValue = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {	
			if(diffValue.containsKey(nums[i])) {
				return new int[]{diffValue.get(nums[i]), i};
			}
			diffValue.put(target - nums[i], i);
		}
		
		return null;
	}
}
