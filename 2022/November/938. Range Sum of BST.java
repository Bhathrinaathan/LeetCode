class Solution {
    int sum;
    public void traverse(TreeNode root,int low,int high)
    {
        if (root==null)
            return;
        else
        {
            if (root.val>low)
                traverse(root.left,low,high);
            if  (root.val<high)
                 traverse(root.right,low,high);
            if(root.val>=low && root.val<=high)
                sum+=root.val;
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        traverse(root,low,high);
        return sum;
    }
}
