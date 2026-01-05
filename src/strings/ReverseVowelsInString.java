/*
345. Reverse Vowels of a String
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
*/

package strings;

public class ReverseVowelsInString {
	public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            while(l<r&&!isVowel(ch[l]))
            {
                l++;
            }
            while(l<r&&!isVowel(ch[r]))
            {
                r--;
            }
            if(l<r)
            {
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }

        }
        return new String(ch);

    }
    public boolean isVowel(char c)
    {
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

}
