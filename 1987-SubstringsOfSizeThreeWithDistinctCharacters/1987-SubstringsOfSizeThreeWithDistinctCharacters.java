// Last updated: 1/9/2026, 12:41:17 pm
class Solution {
    public int countGoodSubstrings(String s) {
        int max=0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i-1)&&s.charAt(i)!=s.charAt(i+1)&&s.charAt(i-1)!=s.charAt(i+1)){
            max++;
        }
        }return max;
    }
}