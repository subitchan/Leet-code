class Solution
 {
    public int removeDuplicates(int[] nums)
     {
       
       String s="";
       
     int x=0;
        for(int i=0;i<nums.length;i++)
        {         

            int count=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j]) count++;
            }
            if(count==0) {nums[x]=nums[i];x++;}
         
        }
    return x;
    
    }
}