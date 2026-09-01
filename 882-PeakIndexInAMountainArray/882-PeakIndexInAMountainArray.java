// Last updated: 1/9/2026, 12:41:36 pm
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int mid=0;
        int left=1;
        int right=arr.length-2;
        while(left<right){
            mid=(left+right)/2;
            if(arr[mid]>arr[mid+1]){
                right=mid;
            }else{
                left=mid+1;
            
            }
        }return right;
        
    }
}