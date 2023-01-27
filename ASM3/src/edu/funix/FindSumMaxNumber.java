package edu.funix;

//reference repo
//https://github.com/sc-yan/leetcode-journey/blob/master/Java/Array/9-Maximum%20Product%20of%20Two%20Elements%20in%20an%20Array.java
public class FindSumMaxNumber {
	public int maxProduct(int[] nums) {
		int max, max2nd;
		max = max2nd = Integer.MIN_VALUE;
		if (nums.length <= 0) {
			return 0;
		}
		if (nums.length == 1) {
			max = max2nd = nums[0];
			return max + max2nd;
		}
		for (int num : nums) {
			if (num >= max) {
				max2nd = max;
				max = num;
			} else if (num >= max2nd) {
				max2nd = num;
			}
		}
		return max + max2nd;
	}
}
