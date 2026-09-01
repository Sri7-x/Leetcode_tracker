// Last updated: 1/9/2026, 12:43:22 pm
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) first = i; 
                last = i;                  
            }
        }
        return new int[]{first, last};
    }
}