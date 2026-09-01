// Last updated: 1/9/2026, 12:41:20 pm
class Solution {
    public int maxVowels(String s, int k) {
       
        int count=0;
        
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u'){
                count++;
            }
        }
        int max=count;
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u'){
                count++;
            }
            char newc=s.charAt(i-k);
            if(newc=='a'||newc=='i'||newc=='o'||newc=='e'||newc=='u'){
                count--;
            }
            max=Math.max(max,count);

            
        }return max;
        
    }
}