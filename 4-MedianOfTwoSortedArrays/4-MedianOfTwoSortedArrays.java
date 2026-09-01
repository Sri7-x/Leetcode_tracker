// Last updated: 1/9/2026, 12:43:38 pm

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length+nums2.length;
        int n[]= new int[l];
        for(int i=0;i<nums1.length;i++){
            n[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            n[nums1.length+i]=nums2[i];
        }
        Arrays.sort(n);
        if(l%2 !=0){
            return(n[l/2]);
        }else{
            return(n[(l/2)-1]+n[l/2])/2.0;
       } 
        
    }
}