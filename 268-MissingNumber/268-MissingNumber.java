// Last updated: 1/9/2026, 12:42:16 pm
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }

        }return nums[nums.length-1]+1;
        
    }
}