class Solution {
    public void findSubsets(int[] nums,int idx,List<List<Integer>> res,List<Integer> lt)
    {
        if (idx>=nums.length)
        {
            res.add(new ArrayList(lt));
            return;
        }
        lt.add(nums[idx]);
        findSubsets(nums,idx+1,res,lt);
        lt.remove(lt.size()-1);
        findSubsets(nums,idx+1,res,lt);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        findSubsets(nums,0,res,new ArrayList<>());
        return res;
    }
}
