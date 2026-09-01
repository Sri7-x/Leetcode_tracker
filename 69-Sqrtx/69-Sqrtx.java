// Last updated: 1/9/2026, 12:43:08 pm
class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x/2;
        int mid=0;
        int a=0;
        if(x<2){
            return x;
        }while(low<=high){
            mid=(low+high)/2;
            if((long)mid*mid==x){
                return mid;
            }else if((long)mid*mid>x){
                high=mid-1;
            }else{
                a=mid;
                low=mid+1;
            }
        }

        return a;
    }
}