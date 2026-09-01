// Last updated: 1/9/2026, 12:41:30 pm
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[]arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}