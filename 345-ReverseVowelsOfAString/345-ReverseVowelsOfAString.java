// Last updated: 1/9/2026, 12:42:08 pm
class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[]ch=s.toCharArray();
        while(left<right){
        while(left<right && !isVowel(ch[left])){
            left++;
        }while(left<right && !isVowel(ch[right])){
            right--;
        }if(left<right){
            char temp=ch[left];
            ch[left++]=ch[right];
            ch[right--]=temp;
        }}
    
    return new String(ch);
        
    }
    public boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}