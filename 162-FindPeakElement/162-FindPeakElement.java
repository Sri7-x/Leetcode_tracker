// Last updated: 1/9/2026, 12:42:45 pm
class Solution {
    public int findPeakElement(int[] nums) {
    for(int i=1;i<nums.length-1;i++){
        if(nums[i]>nums[i-1]&& nums[i+1]<nums[i]){
            return i;
        }
    
    }
    return nums[0]>nums[nums.length-1] ? 0:nums.length-1;
}
}