// Last updated: 1/9/2026, 12:43:14 pm
class Solution {
    public int maxSubArray(int[] nums) {
        int csum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            csum=Math.max(nums[i],csum+nums[i]);
            maxsum=Math.max(maxsum,csum);
        }return maxsum;

        
    }
}