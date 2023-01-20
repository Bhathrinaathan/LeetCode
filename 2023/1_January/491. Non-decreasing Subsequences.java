class Solution {
    public void backtrack(Set<List<Integer>> result,int[] nums,List<Integer> temp,int index)
    {
        if (index==nums.length){
            if (temp.size()>1){
                result.add(new ArrayList<>(temp));
            }
            return;        
        }
        if ( temp.size()==0 || temp.get(temp.size()-1)<=nums[index])
        {
            temp.add(nums[index]);
            backtrack(result,nums,temp,index+1);
            temp.remove(temp.size()-1);
        }
        backtrack(result,nums,temp,index+1);
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> result=new HashSet<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        backtrack(result,nums,temp,0);
        return new  ArrayList(result);
    }
}
