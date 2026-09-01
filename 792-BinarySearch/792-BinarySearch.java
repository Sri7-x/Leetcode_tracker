// Last updated: 1/9/2026, 12:41:38 pm
class Solution {
    public int search(int[] nums, int target) {
        int si=0;
        int li=nums.length-1;
        int mid=0;
        int  z=0;
        while(si<=li){
            mid=(si+li)/2;
            if(nums[mid]==target){
                z=1;
                break;
                
            }else if(target>nums[mid]){
                si=mid+1;

            }else{
                li=mid-1;
            }

        }if(z==0){
            return -1;
        }

       return mid; 
    }
}