/*
242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
*/
package strings;

import java.util.Arrays;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
	       char[] sc=s.toCharArray();
	       char[] tc=t.toCharArray();
	       Arrays.sort(sc);
	       Arrays.sort(tc);
	       if(new String(sc).equals(new String(tc)))
	       {
	        return true;
	       }
	       return false;
	    }
	/*public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sCount.put(s.charAt(i), 1 + sCount.getOrDefault(s.charAt(i), 0));
            tCount.put(t.charAt(i), 1 + tCount.getOrDefault(t.charAt(i), 0));
        }

        return sCount.equals(tCount);        
    }
    */
}
