

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
       if(p==null&&q==null) return true;
       if(q==null||p==null) return false;
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(p);
         Queue<TreeNode> q2=new LinkedList<>();
        q2.add(q);
        while(!q1.isEmpty()&&!q2.isEmpty())
        {
            TreeNode temp1=q1.poll();
            TreeNode temp2=q2.poll();
            if(temp1.val!=temp2.val)
            {
                return false;
            }
            if(temp1.left!=null && temp2.left!=null)
            {
                q1.add(temp1.left);
                q2.add(temp2.left);
            }
             if(temp1.right!=null && temp2.right!=null)
            {
                q1.add(temp1.right);
                q2.add(temp2.right);
            }
            if((temp1.left!=null&&temp2.left==null)||(temp1.right!=null&&temp2.right==null))
            {
                return false;
            }

             if((temp1.left==null&&temp2.left!=null)||(temp1.right==null&&temp2.right!=null))
            {
                return false;
            }
          
           
        }
        return true;

    }
}
