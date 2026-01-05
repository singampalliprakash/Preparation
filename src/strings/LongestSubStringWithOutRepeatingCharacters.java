/*
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
 */

package strings;

import java.util.HashSet;

public class LongestSubStringWithOutRepeatingCharacters {
	class Solution {
	    public int lengthOfLongestSubstring(String s) {
	        int left=0;
	        int max_len=0;
	        HashSet<Character> set=new HashSet<>();

	        for(int right=0;right<s.length();right++)
	        {
	            char c=s.charAt(right);

	            while(set.contains(c))
	            {
	                set.remove(s.charAt(left));
	                left++;
	            }
	            set.add(c);
	            
	            max_len=Math.max(max_len,right-left+1);
	            
	        }
	       return max_len;
	    }
	}

}
