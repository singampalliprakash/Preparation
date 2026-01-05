/*
643. Maximum Average Subarray I
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
Any answer with a calculation error less than 10-5 will be accepted.
Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/
package arrays;

public class MaximumAverageSubArray {
	public double findMaxAverage(int[] nums, int k) {
        double win_avg=0;
        for(int i=0;i<k;i++)
        {
            win_avg+=nums[i];
        }

        double max_avg=win_avg;
        for(int j=k;j<nums.length;j++)
        {
            win_avg+=nums[j]-nums[j-k];
             max_avg=Math.max(max_avg,win_avg);

        }
        return max_avg/k;   
    }
	

}
