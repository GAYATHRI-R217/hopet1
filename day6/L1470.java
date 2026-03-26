package day6;

public class L1470 {
    /*class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int k=0;
        int[] arr=new int[nums.length];
        while(j<nums.length){
            arr[k]=nums[i];
            arr[k+1]=nums[j];
            i++;
            j++;
            k+=2;

        }
        return arr;
    }
}*/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[n + i];
        }

        return arr;
    }
}
}
