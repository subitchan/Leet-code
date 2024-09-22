class Solution {
    public void sortColors(int[] nums) {
       // Arrays.sort(nums);

      // int a[]=new int[nums.length];

       int z=0;
       int o=0;
       int t=0;

       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0) z++;
        else if(nums[i]==1) o++;
        else if(nums[i]==2) t++;
       }
       
       for(int i=0;i<nums.length;i++)
       {
        if(z>0) {nums[i]=0;z--;}
        else  if(o>0) {nums[i]=1;o--;}
        else  if(t>0) {nums[i]=2;t--;}
       }
    }
}