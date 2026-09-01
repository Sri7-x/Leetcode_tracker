// Last updated: 1/9/2026, 12:43:36 pm
class Solution {
    public boolean isPalindrome(int x) {
        int rever=0;
        int X=x;
        while(x>0){
        
            int r=x%10;
            x=x/10;
            rever=rever*10+r;
        }
        if(X==rever){
            return true;
        }else{
            return false;
        }
        
    }
}