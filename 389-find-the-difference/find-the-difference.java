class Solution {
    public char findTheDifference(String s, String t) {

        String s3=s+t;
        char[] s1=s3.toCharArray();
        Arrays.sort(s1);

        for(int i=0;i<s1.length-1;i++)
        {
            if(s1[i]==s1[i+1])
            {
                i++;
            }
            else
            {
                return s1[i];
            }

        }
        return s1[s1.length-1];


        
    }
}