// Last updated: 1/9/2026, 12:41:05 pm
class Solution {
    public int longestContinuousSubstring(String s) {
           int mx_len = 0; 
        int cnt = 1;

        if(s.length() == 1) return 1;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) - s.charAt(i-1) != 1){
                mx_len = Math.max(mx_len, cnt);
                cnt = 1;
            }
            else cnt++;
        }
        mx_len = Math.max(mx_len, cnt);

        return mx_len;
    }
}