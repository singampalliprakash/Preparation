/*
125. Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
 */
package strings;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		   int l=0;
		   int r=s.length()-1;
		   while(l<r)
		   {
		    if(!Character.isLetterOrDigit(s.charAt(l)))
		    {
		        l++;
		    }
		    else if(!Character.isLetterOrDigit(s.charAt(r)))
		    {
		        r--;
		    }
		    else if(Character.toLowerCase(s.charAt(l))==
							Character.toLowerCase(s.charAt(r))) {
						l++;
						r--;
						
					}
		    else
		    {
		        return false;
		    }
		   }
		   return true;
		  }

}
