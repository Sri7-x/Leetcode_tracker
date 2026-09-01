// Last updated: 1/9/2026, 12:43:05 pm
class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int flag=0;
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int k=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=k;
                    flag=1;
                }
            }if(flag==0){
                break;
            }
        }System.out.print(Arrays.toString(nums));
        
    }
}