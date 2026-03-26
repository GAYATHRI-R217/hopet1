package day6;

public class L3232 {
    class Solution {
    public boolean canAliceWin(int[] nums) {
        int s=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                s+=nums[i];
            }
            else{
                d+=nums[i];
            }
        }
    return (s!=d);
    }
}
    
}
