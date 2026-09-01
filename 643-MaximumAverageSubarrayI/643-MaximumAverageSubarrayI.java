// Last updated: 1/9/2026, 12:41:46 pm
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=sum;
        for(int i=1;i<nums.length-k+1;i++){
            sum=sum-nums[i-1]+nums[i+k-1];
            max=Math.max(sum,max);
        }return max/k;
    
        
    }
}