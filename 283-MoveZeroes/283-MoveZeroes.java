// Last updated: 1/9/2026, 12:42:14 pm
class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
            }
        }   
    }
}