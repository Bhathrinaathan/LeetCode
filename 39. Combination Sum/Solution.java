class Solution {
    public void  findCombinations(int[] arr,int target,int idx,ArrayList<Integer> lt,List<List<Integer>> ans)
    {
        if (idx>=arr.length)
        {
            if (target==0)
                ans.add(new ArrayList<>(lt));
            return;
        }
        if (arr[idx]<=target)
        {
            lt.add(arr[idx]);
            findCombinations(arr,target-arr[idx],idx,lt,ans);
            lt.remove(lt.size()-1);
        }
        findCombinations(arr,target,idx+1,lt,ans);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        findCombinations(candidates,target,0,new ArrayList<Integer>(),res);
        return res;
    }
}
