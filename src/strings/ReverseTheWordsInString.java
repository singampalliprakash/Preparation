/*
557. Reverse Words in a String III
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"
 */

package strings;

public class ReverseTheWordsInString {
	    public String reverseWords(String s) {
	        String[] arr = s.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String st : arr) {
	            for (int i = st.length() - 1; i >= 0; i--) {
	                result.append(st.charAt(i));
	            }
	            result.append(" ");
	        }

	        return result.toString().trim(); 
	    }


}
