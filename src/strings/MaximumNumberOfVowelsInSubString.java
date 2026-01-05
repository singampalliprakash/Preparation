/*
1456. Maximum Number of Vowels in a Substring of Given Length
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
Example 1:
Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:
Input: s = "aeiou", k = 2
Output: 2
 */
package strings;

public class MaximumNumberOfVowelsInSubString {
	    private boolean isVowel(char c)
	    {
	        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	    }
	    public int maxVowels(String s, int k) {
	        int count=0;
	        for(int i=0;i<k;i++)
	        {
	            if(isVowel(s.charAt(i)))
	            {
	                count++;
	            }
	        }
	        int max_Count=count;

	        for(int j=k;j<s.length();j++)
	        {
	            if(isVowel(s.charAt(j)))
	            {
	                count++;
	            }
	            if(isVowel(s.charAt(j-k)))
	            {
	                count--;
	            }
	            max_Count=Math.max(max_Count,count);
	        }
	        return max_Count;
	    }
	

}
