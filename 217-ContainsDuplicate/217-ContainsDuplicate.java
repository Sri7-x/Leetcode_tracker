// Last updated: 1/9/2026, 12:42:22 pm
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int i:nums){
            if(map.contains(i)){
                return true;
            }
        map.add(i);
        }
        return false;
    }
}