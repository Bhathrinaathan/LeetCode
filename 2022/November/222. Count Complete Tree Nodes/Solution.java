
class Solution {
    private int count=0;
    public void traverseTree(TreeNode root)
    {
        if (root==null) 
            return;
        if (root.left==null && root.right==null)
        {   count+=1;return;    }
        if (root.left!=null)
        {
            count=count+1;
            if  (root.right!=null)
                traverseTree(root.right);
            traverseTree(root.left);
        }
    }
    public int countNodes(TreeNode root) {
        count=0;
        traverseTree(root);
        return count;
    }
}
