class Solution {
    int res=0;
    public void traverse(TreeNode root,PriorityQueue<Integer> minHeap,PriorityQueue<Integer> maxHeap)
    {
        if (root==null)
            return;
        if (!maxHeap.isEmpty()){
        if (Math.abs(maxHeap.peek()-root.val)>res)
            res=Math.abs(maxHeap.peek()-root.val);
        if (Math.abs(minHeap.peek()-root.val)>res)
            res=Math.abs(minHeap.peek()-root.val);
        }
        maxHeap.add(root.val);minHeap.add(root.val);
        traverse(root.right,minHeap,maxHeap);
        traverse(root.left,minHeap,maxHeap);
        minHeap.remove(root.val);
        maxHeap.remove(root.val);
    }
    public int maxAncestorDiff(TreeNode root) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        res=0;
        traverse(root,minHeap,maxHeap); 
        return res;
    }
}
