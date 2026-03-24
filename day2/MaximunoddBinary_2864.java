package day2;

public class MaximunoddBinary_2864 {
    class Solution {
    public String maximumOddBinaryNumber(String s) {
     int oc=0;
     int zc=0;
     String fs="";
    for(char c : s.toCharArray()) {
    if(c == '1') {
        oc++;
    }
    else{
        zc++;
    }
}
    if(oc==1){
        while(zc>0){
            fs=fs+0;
            zc--;
        }
        fs=fs+1;
    }
    else{
        while(oc>1){
            fs=fs+1;
            oc--;
        }
        while(zc>0){
            fs=fs+0;
            zc--;
        }
        fs=fs+1;
    }
    return fs;
    }
}
}
