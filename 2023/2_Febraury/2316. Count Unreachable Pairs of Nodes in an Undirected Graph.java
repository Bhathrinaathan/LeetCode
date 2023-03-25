class Solution {
    List<List<Integer>> adj;
    boolean[] visited;
    int nodes=0;
    public void dfs(int node)
    {
        List<Integer> arr=adj.get(node);
        for (int i=0;i<arr.size();i++)
        {
            if (!visited[arr.get(i)]){
                nodes++;
                visited[arr.get(i)]=true;
                dfs(arr.get(i));
            }
        }
    }
    public long countPairs(int N, int[][] edges) {
        adj=new ArrayList<>();
        ArrayList<Integer> nodeCount=new ArrayList<>(); 
        for (int i=0;i<N;i++)
            adj.add(new ArrayList<Integer>());
        for (int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int components=1;
        long val=0l,totalNodes=0;
        visited=new boolean[N];
        Arrays.fill(visited,false);
        nodes=0;
        dfs(0);
        nodeCount.add(nodes);
        totalNodes=nodes;
        for (int i=0;i<N;i++)
        {
            if (!visited[i])
            {
                nodes=1;
                visited[i]=true;
                components++;
                dfs(i);
                nodeCount.add(nodes);totalNodes+=nodes;
            }
        }
        for (int i=0;i<nodeCount.size();i++)
        {
            val=val+(nodeCount.get(i)*(totalNodes-nodeCount.get(i)));
            totalNodes-=nodeCount.get(i);
        }
        System.out.println(components+"\n"+nodeCount);
        return val;
    }
}
