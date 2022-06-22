class Solution {
    public int findKthLargest(int[] nums, int k) {
        int max=0,temp;
        for (int i=0;i<k;i++)
        {
            max=i;
            for (int j=i+1;j<nums.length;j++)
                if (nums[j]>nums[max])
                    max=j;
            temp=nums[max];
            nums[max]=nums[i];
            nums[i]=temp;
        }
        return nums[k-1];
    }
}
