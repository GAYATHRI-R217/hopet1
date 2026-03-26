package day7;

public class L_724 {
    class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
        }    
        int leftsum = 0;
        for(int i=0;i<nums.length;i++){
            total -= nums[i];
            if(total==leftsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}
    
}
