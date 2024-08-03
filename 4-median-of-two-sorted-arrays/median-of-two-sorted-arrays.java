class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=0;
        int nw[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            nw[x]=nums1[i];
            x++;
        }

        for(int i=0;i<nums2.length;i++)
        {
            nw[x]=nums2[i];
            x++;
        }
        Arrays.sort(nw);
        if(nw.length%2!=0)
        {
            return (double) nw[nw.length/2];
        }
        else
        {
            return (double) (nw[nw.length/2]+nw[(nw.length/2)-1])/2;
        }

    }
}