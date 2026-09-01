// Last updated: 1/9/2026, 12:43:11 pm
class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        return arr[arr.length-1].length();
        
    }
}