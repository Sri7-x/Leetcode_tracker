// Last updated: 1/9/2026, 12:43:40 pm
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};}
            }
       
        }
        return new int[] {};
    }
        

        
    
}