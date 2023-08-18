class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[][] adj=new int[n][n];
        int[] deg=new int[n];
        int max=0;
        for (int i=0;i<roads.length;i++)
        {
            adj[roads[i][0]][roads[i][1]]=adj[roads[i][1]][roads[i][0]]=1;
            deg[roads[i][0]]++;
            deg[roads[i][1]]++;
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i!=j)
                {
                    int res=deg[i]+deg[j];
                    res+=(adj[i][j]==1?-1:0);
                    max=Math.max(max,res);
                }
            }

        }
        return max;
    }
}
