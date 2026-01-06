/*
2000. Reverse Prefix of Word
Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and 
ends at the index of the first occurrence of ch (inclusive).
 If the character ch does not exist in word, do nothing.
For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive).
 The resulting string will be "dcbaefd".
Return the resulting string.
Example 1:
Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
 */
package strings;

public class ReversePrefixOfWord {
	    public String reversePrefix(String word, char ch) {
	        char[] arr=word.toCharArray();
	        int start=0;
	        int end=-1;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]==ch)
	            {
	                 end=i;
	                 break;
	                
	            }
	        }
	            if(end==-1)
	            return word;

	            reverse(arr,start,end);
	           
	        
	         return new String(arr);
	       
	        
	    }
	    public void reverse(char[] arr,int start,int end)
	    {
	        while(start<end)
	        {
	        char temp=arr[start];
	        arr[start]=arr[end];
	        arr[end]=temp;
	        start++;
	        end--;
	        }
	    }

}
