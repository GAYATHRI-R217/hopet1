package day6;

public class L1221 {
    class Solution {
    public int balancedStringSplit(String s) {
        int balance=0,c=0;
        for(char ch:s.toCharArray()){
            if(ch=='R'){
                balance++;
            }
            else{
                balance--;
            }
            if(balance==0){
                c++;
            }
        }
            return c;
    }
}
    
}
