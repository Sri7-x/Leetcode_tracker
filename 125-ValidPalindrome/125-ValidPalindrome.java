// Last updated: 1/9/2026, 12:42:56 pm
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char c=s.charAt(left);
            char ch=s.charAt(right);
            if(!Character.isLetterOrDigit(c)){
                left++;
            }
            else if(!Character.isLetterOrDigit(ch)){
                right--;
            }else{

             if(Character.toLowerCase(c)!=Character.toLowerCase(ch)){
                return false;
            }
            left++;right--;
        }
        }
        return true;
    }
}