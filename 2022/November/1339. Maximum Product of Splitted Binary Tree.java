class Solution {
    long MOD=(long)(Math.pow(10,9)+7);
    long totalSum=0,sum=0,maxProd=1;
    public void findTotalSum(TreeNode root)
    {
        if (root==null) return;
        totalSum+=root.val;
        findTotalSum(root.left);
        findTotalSum(root.right);
    }
    public long findMaxProd(TreeNode root)
    {
        if(root==null)  return 0;
        long l=findMaxProd(root.left);
        long r=findMaxProd(root.right);
        sum=l+r+root.val;
        maxProd=Math.max(maxProd,((totalSum-sum)*sum));
        return sum;
    }
    public int maxProduct(TreeNode root) {
        maxProd=0;totalSum=0;sum=0;
        findTotalSum(root);
        findMaxProd(root);
        return (int)(maxProd%MOD);
    }
}
