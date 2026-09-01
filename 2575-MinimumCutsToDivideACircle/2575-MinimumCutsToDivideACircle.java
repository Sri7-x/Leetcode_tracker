// Last updated: 1/9/2026, 12:41:04 pm
class Solution {
    public int numberOfCuts(int n) {
        if(n==1){
            return 0;
        }
        if(n%2>0){
            return n;
        }return n/2;
        
    }
}