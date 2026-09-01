// Last updated: 1/9/2026, 12:42:02 pm
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                max=max+1;
                maxi=Math.max(maxi,max);
            }else{
                max=0;
            }
        }
        return maxi;

        
        
    }
}