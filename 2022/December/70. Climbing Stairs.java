class Solution {
    public int climbStairs(int n) {
        int[] steps=new int[n+1];
        if (n<3)
            return n;
        steps[1]=1;
        steps[2]=2;
        for (int i=3;i<=n;i++) 
            steps[i]=steps[i-1]+steps[i-2];
        return steps[n];
    }
}
