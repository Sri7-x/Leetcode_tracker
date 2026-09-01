// Last updated: 1/9/2026, 12:42:44 pm
class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       return nums[n/2];
    }
}