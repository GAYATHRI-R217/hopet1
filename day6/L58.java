package day6;

public class L58 {
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split("\\s+");
        int l=arr.length;
        return arr[l-1].length();
        /*s = s.trim();
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        
        return length;*/
    }
}
}
