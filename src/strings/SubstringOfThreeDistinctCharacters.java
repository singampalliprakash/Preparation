/*
1876. Substrings of Size Three with Distinct Characters
A string is good if there are no repeated characters.
Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.
Example 1:
Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
 */
package strings;

public class SubstringOfThreeDistinctCharacters {
	public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            char c=s.charAt(i+2);

            if(a!=b&&b!=c&&c!=a)
            {
                count++;
            }
        }
        return count;
    }

}
