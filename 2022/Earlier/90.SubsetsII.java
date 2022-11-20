class Solution {
    public void findSubsets(int[] nums,int idx,List<List<Integer>> res,List<Integer> lt)
    {
        res.add(new ArrayList(lt));
        for (int i=idx;i<nums.length;i++)
        {
            if (i!=idx && nums[i]==nums[i-1])
                continue;
            lt.add(nums[i]);
            findSubsets(nums,i+1,res,lt);
            lt.remove(lt.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);       
        findSubsets(nums,0,res,new ArrayList<>());
        return res;
    }
}
