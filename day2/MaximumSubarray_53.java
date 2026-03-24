package day2;

public class MaximumSubarray_53 {
    class Solution {
    public int maxSubArray(int[] nums) {
       /*//m 
       int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(max<sum){
        max=sum;
        }
    return max;*/

    int max=nums[0];
    int sum=0;
    for(int i:nums){
        sum+=i;
        if(sum>max){
            max=sum;
        }
        if(sum<0){
            sum=0;
        }
    }
    return max;
    }
}
}
