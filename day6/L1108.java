package day6;

public class L1108 {
    class Solution {
    public String defangIPaddr(String address) {
        /*String a=address.replace(".","[.]");
        return a;*/
        String[] a=address.split("\\.");
        String s="";
        for(int i=0;i<a.length-1;i++){
            s=s+a[i];
            s=s+"[.]";
        } 
        s=s+a[a.length-1];
    return s;
    }
}   
}
