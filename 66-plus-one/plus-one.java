class Solution {
    public int[] plusOne(int[] digits) {
      int c=0;
      for(int i=0;i<digits.length;i++)
      {
        if(digits[i]==9) c++;
      }
      if(c==0)
      {
        digits[digits.length-1]=digits[digits.length-1]+1;
        return digits;
      }
      if(c==digits.length)
      {
        int a[]=new int[c+1];
        a[0]=1;
        return a;
      }
      int i=digits.length-1;
      while(digits[i]==9)
      {
        digits[i]=0;
        i--;
      }
      digits[i]=digits[i]+1;
  
      
      return digits;
     
      }
        
    }
