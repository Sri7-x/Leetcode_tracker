// Last updated: 1/9/2026, 12:42:58 pm
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]<min){
                min=Math.min(min,prices[i]);
            }
            else{
                int profit=prices[i]-min;
                max=Math.max(max,profit);
            }
        }

        return max;
    }
}