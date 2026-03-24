package day3;

public class validPalindrome_125 {
    class Solution {
    public boolean isPalindrome(String s) {
        String a = "";

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                a = a + s.charAt(i);
            }
        }

        a = a.toLowerCase();

        String aa = "";
        char[] ch = a.toCharArray();

        for(int i = ch.length - 1; i >= 0; i--){
            aa = aa + ch[i];
        }

        return aa.equals(a);
    }
}
}
