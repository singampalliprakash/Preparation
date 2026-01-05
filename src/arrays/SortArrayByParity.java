/*
 905. Sort Array By Parity
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Reutrn any array that satisfies this condition.
Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:
Input: nums = [0]
*/

package arrays;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] nums) {
        // int left=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]%2==0)
        //     {
        //        int temp=nums[i];
        //        nums[i]=nums[left];
        //        nums[left]=temp;
        //        left++;
               
        //     }
            
        // }
        // return nums;

        //Using two pointers
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            while(l<r&&nums[l]%2==0)
            {
                l++;
            }
            while(l<r&&nums[r]%2!=0)
            {
                r--;
            }

            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
        
        }
        return nums;
    }

}
