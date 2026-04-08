package day13;

public class L189 {
/*    public void rotate(int[] nums, int k) {
        k=(k%nums.length);
        for(int i=0;i<k;i++){
            int last=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
        }
        nums[0]=last;
        }
    }
}*/ public void reverse(int [] arr,int s,int e){
        while(s<e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
    }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}