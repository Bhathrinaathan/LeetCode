class Solution {
    public void dfs(int[][] stones,boolean[] visited,int idx)
    {
        visited[idx]=true;
        System.out.print(idx+" === ");
        for (int i=0;i<stones.length;i++)
        {
            if(!visited[i] &&(stones[idx][0]==stones[i][0] || stones[idx][1]==stones[i][1]))
            {   
                dfs(stones,visited,i);
            }
        }
    }
    public int removeStones(int[][] stones) {
        boolean[] visited=new boolean[stones.length];
        int count=0;
        for (int i=0;i<stones.length;i++)
        {
            if (!visited[i])
            {
                dfs(stones,visited,i);
                count++;
            }
        }
        return stones.length - count;
    }
}
