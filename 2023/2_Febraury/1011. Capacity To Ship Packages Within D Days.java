class Solution {
    public boolean canBeShipped(int[] weights,int days,int capacity)
    {
        int curDays=1,currCapacity=capacity;
        for (int w: weights)
        {
            if (currCapacity-w<0)
            {
                curDays+=1;
                currCapacity=capacity;
            }
            currCapacity-=w;
        }
        return curDays<=days;

    }
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight=0,totalWeight=0;
        for (int i=0;i<weights.length;i++){
            maxWeight=Math.max(maxWeight,weights[i]);
            totalWeight+=weights[i];
        }
        int capacity=totalWeight;
        int left=maxWeight,right=totalWeight,mid;
        while(left<=right){
            mid=(left+right)/2;
            if (canBeShipped(weights,days,mid))
            {
                capacity=Math.min(capacity,mid);
                right=mid-1;
            }
            else
                left=mid+1;
        }
        return capacity;
    }
}
