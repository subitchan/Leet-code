class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
    {
        List<Integer> li=new ArrayList<>();
         List<Integer> li1=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
           
                li.add(nums1[i]);
            
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(li.contains(nums2[i]))
            {
                if(!li1.contains(nums2[i]))
                {
                    li1.add(nums2[i]);
                }
            }
        }
         int arr[]=new int[li1.size()];
        for(int i=0;i<li1.size();i++)
        {
            arr[i]=li1.get(i);
        }
       
        return arr;
    }
}