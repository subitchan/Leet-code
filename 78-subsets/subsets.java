class Solution {

    public static void solve(int[] a,List<List<Integer>> result,List<Integer> li,int i)
    {
        if(i==a.length)
        {
            result.add(new ArrayList<>(li));
        }
        else
        {
            li.add(a[i]);
            solve(a,result,li,i+1);
            li.remove(li.size()-1);
            solve(a,result,li,i+1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result=new ArrayList<>();

    List<Integer> li =new ArrayList<>();

    solve(nums,result,li,0);

    return result;

        
    }
}