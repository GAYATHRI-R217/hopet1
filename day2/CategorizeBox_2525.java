package day2;
public class CategorizeBox_2525 {
    class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long v=(long)length*width*height;
        String s="";

        if(v>=1000000000||length>=10000||width>=10000||height>=10000){
            s="Bulky";
            if(mass>=100){
                s= "Both";
            }
        }
        else{
            if(mass>=100){
                s="Heavy";
            }
            else{
                s="Neither";
            }
        }
        return s;
    }
}
}
