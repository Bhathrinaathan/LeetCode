class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxList=new int[nums.length - k + 1];
        int maxIndex=0;
        Deque<Integer> dq=new ArrayDeque<Integer>();
        for (int i=0;i<nums.length;i++)
        {
            //To remove the element out of the Window
            if (!dq.isEmpty() && dq.peek()==i-k)
                dq.poll();
            
            //To remove the numbers which cant be max
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
                dq.pollLast();

            dq.offer(i);

            if (i>=k-1)
                maxList[maxIndex++]=nums[dq.peek()];
        }
        return maxList;
    }
}

/*
        for (int i=0;i<k;i++)
        {
            if (nums[maxIndex]<nums[i])
                maxIndex=i;
        }
        maxList[resIndex++]=nums[maxIndex];
        for (int i=1,j=k;j<nums.length;i++,j++)
        {
            if (nums[maxIndex]<=nums[j])
                maxIndex=j;
            if (maxIndex<i)
            {
                maxIndex=i;
                for (int q=i;q<=j;q++)
                {
                    if (nums[maxIndex]<nums[q])
                        maxIndex=q;
                }
            }
            maxList[resIndex++]=nums[maxIndex];
        }

*/
