package day22;

import java.util.ArrayList;

public class L500 {
    class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> a=new ArrayList<>();
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";
        for(String i:words){
            if(iir(i,r1)||iir(i,r2)||iir(i,r3))
            a.add(i);
        }
        return a.toArray(new String[0]);
    }
    private boolean iir(String s,String row){
        for(char c:s.toCharArray()){
            if(row.indexOf(Character.toLowerCase(c))==-1){
                return false;
            }
        }
        return true;
    }
}
    
}
