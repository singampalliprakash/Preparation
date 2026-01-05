/*
383. Ransom Note
Given two strings ransomNote and magazine,
return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false
*/

package strings;

import java.util.HashMap;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:magazine.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch:ransomNote.toCharArray())
        {
            if(!hm.containsKey(ch)||hm.get(ch)==0)
            {
                return false;
            }
            hm.put(ch,hm.get(ch)-1);
        }
        return true;
    }
}
