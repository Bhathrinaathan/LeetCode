/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void findPaths(TreeNode root,int target,int sum,List<Integer> lt,List<List<Integer>> res)
    {
        if (root==null) return;
        lt.add(root.val);
        sum+=root.val;
        if (target==sum && root.right==null && root.left==null)
            res.add(new ArrayList(lt));
        findPaths(root.left,target,sum,lt,res);
        findPaths(root.right,target,sum,lt,res);
        lt.remove(lt.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        if (root==null)
            return res;
        findPaths(root,targetSum,0,new ArrayList<Integer>(),res);
        return res;
    }
}
