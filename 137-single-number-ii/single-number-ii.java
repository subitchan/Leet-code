class Solution {
    public int singleNumber(int[] nums) {
        
  Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            if(i+2<nums.length-1&&nums[i+2]!=nums[i])
            {
                return nums[i];

            }
            if(i==nums.length-1)
            {
                return nums[i];
            }
            else i+=2;
        }
        return 0;
        
    }
}