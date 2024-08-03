class Solution {
        public static boolean pal(String s)
    {
        
        if(s.length()==1) return true;
        int i=0;
        int j=s.length()-1;
        while(i!=j&&i!=j+1)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;

        }
        return true;
    }
    public String longestPalindrome(String s) {

        
    //    if(s.length()==1) return s;
        String ans="";
        // if(s.length()>100) return "ranynar";
        for(int i=0;i<s.length();i++)
        {
            String rev="";

            for(int j=i+1;j<=s.length();j++)
            {
                rev=s.substring(i,j);
              if(pal(rev)&&ans.length()<rev.length()) {ans=rev;}

            }


        }
        return ans;

        
    }
}