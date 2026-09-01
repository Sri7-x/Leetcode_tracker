// Last updated: 1/9/2026, 12:42:13 pm
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int num:nums){
            if(s.contains(num)){
                return num;
            }
            s.add(num);

        
                
        }return 0;
        
    }
}