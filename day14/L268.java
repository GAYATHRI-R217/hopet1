package day14;

import java.util.HashSet;
import java.util.Set;

public class L268 {
     public int missingNumber(int[] nums) {
       /* Arrays.sort(nums);
        int n=nums.length;
        int out=n;
        for(int i=0;i<n;i++){
            if(i!=nums[i]){
                out=i;
                break;
            }
        }
        return out;*/
        /*int n=nums.length;
        int tot=n*(n+1)/2;
        int sum=0;
        for(int ans:nums){
            sum+=ans;
        }
        return tot-sum;*/
        Set<Integer> n=new HashSet<>();
        for(int num:nums){
            n.add(num);
        }
        for(int i=0;i<=nums.length;i++){
            if(!n.contains(i)){
                return i;
            }
        }
return -1;
    }
}
