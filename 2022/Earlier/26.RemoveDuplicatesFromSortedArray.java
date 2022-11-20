class Solution {
    public int removeDuplicates(int[] nums) {
        int top=0;
        for (int i=1;i<nums.length;i++)
        {
            if (nums[top]!=nums[i])
                nums[++top]=nums[i];
        }
        return top+1;
    }
}
