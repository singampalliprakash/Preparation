/*
151. Reverse Words in a String
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces.
Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"
 */
package strings;

public class ReverseTheWords {
	    public String reverseWords(String s) {
	        String[] arr=s.split("\\s+");
	        StringBuilder sb=new StringBuilder();
	            for(int i=arr.length-1;i>=0;i--)
	        {
	            sb.append(arr[i]);
	            if(i>0)sb.append(" ");
	        }
	        
	        return sb.toString().trim();
	    }
	        
	}


