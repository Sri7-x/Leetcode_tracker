// Last updated: 1/9/2026, 12:42:05 pm
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        while(i < nums.length)
        {
            int corrPos = nums[i] - 1;

            if(nums[corrPos]!=nums[i])
            {
                int temp = nums[corrPos];
                nums[corrPos] = nums[i];
                nums[i] = temp;
            }
            else
            i++;
        }
        for( i = 0;i<nums.length;i++)
        {
            if(i!=nums[i]-1)
            {
                list.add(i+1);
         }
        
        }
        return list;
        
    }}
