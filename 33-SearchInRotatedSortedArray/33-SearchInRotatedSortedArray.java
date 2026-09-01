// Last updated: 1/9/2026, 12:43:23 pm
class Solution {
    public int search(int[] nums, int target) { int left=0;
        int right=nums.length-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;

            }else if(nums[mid]>=nums[left]){
                if(target<=nums[mid] &&target>=nums[left]){
                    right=mid-1;
                    }
                else{
                    left=mid+1;
                }
                

            }else{
                if(target>=nums[mid] && target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }return -1;
        
    }
}