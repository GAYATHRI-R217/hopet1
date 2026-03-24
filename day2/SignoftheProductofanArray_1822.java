package day2;
public class SignoftheProductofanArray_1822 {
class Solution {
    public int arraySign(int[] nums) {
        /*long mult=1;
        int res=0;
        for(int i=0;i<nums.length;i++){
            mult*=(long)nums[i];
        }
        if(mult>0){
            res=1;
        }
        else if(mult<0){
            res=-1;
        }
        else if(mult==0) {
            res=0;
        }
        return res;*/
        /* // counting negative sign
        int n=0;
        int sign=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)return 0;
            if(nums[i]<0){
                n++;
            }
        }
        if(n%2!=0){
           sign=-sign;
        }
        return sign;
        */
        int sign=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)return 0;
            if(nums[i]<0){
                sign=-sign;
            }
        }
        return sign;
        }
}
}