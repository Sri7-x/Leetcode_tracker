// Last updated: 1/9/2026, 12:42:55 pm
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int n:nums){
            result ^=n;
        }return result;

    }
}