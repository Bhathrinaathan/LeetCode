class Solution {
    private int totalSum;
    public void findNumber(TreeNode root,int curr)
    {
        if(root==null)
            return;
        if (root.left==null && root.right==null)
        {
            curr=curr*10 + root.val;
            totalSum+=curr;
            return;
        }
        curr=curr*10 + root.val;
        findNumber(root.left,curr);
        findNumber(root.right,curr);
        curr/=10;
    }
    public int sumNumbers(TreeNode root) {
        totalSum=0;
        findNumber(root,0);
        return totalSum;

    }
}
