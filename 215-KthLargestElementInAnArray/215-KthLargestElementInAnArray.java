// Last updated: 1/9/2026, 12:42:23 pm
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return(nums[nums.length-k]);
        
    }
}