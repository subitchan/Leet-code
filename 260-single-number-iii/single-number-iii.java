class Solution {
    public int[] singleNumber(int[] nums) {
          Arrays.sort(nums);
          int res[]=new int[2];
          int x=0;
          for(int i=0;i<nums.length-1;i++)
          {
            if(nums[i]==nums[i+1])
            {
                nums[i]=10000;
                nums[i+1]=10000;
                i++;

            } 
          
          }
          

            for(int i=0;i<nums.length;i++)
          {
            if(nums[i]!=10000&&x<2){
                res[x]=nums[i];
                x++;
              

            } 
          }
          return res;

   
    }
}