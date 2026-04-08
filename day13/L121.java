package day13;

public class L121 {
    public int maxProfit(int[] prices) {
       /* int s=Arrays.sort(prices[]);
        int b=s[0];
        int f=0;
        for(int i=0;i<prices.length;i++){
            if(prices[prices.length-1]==b){
                f=0;
            }
            else{
                if(prices[i]==b){
                    int high=prices[i];
                    for(int j=i;j<prices.length;j++){
                        if(prices[j]>high){
                            high=prices[j];
                        }
                    }
                    f=high;
                }
            }
        }
        return f;*/
        int b=prices[0];
        int f=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<b){
                b=prices[i];
            }
            int profit=prices[i]-b;
            if(profit>f){
                f=profit;
            }
        }
        return f;
    }
}
