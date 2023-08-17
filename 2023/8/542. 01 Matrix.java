class Node{
    int row,col,distance;
    Node(int r,int c,int d){
        row=r;
        col=c;
        distance=d;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] dist=new int[mat.length][mat[0].length];
        int[][] visited=new int[mat.length][mat[0].length];
        int m=mat.length,n=mat[0].length;
        Queue<Node> q=new LinkedList<>();
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (mat[i][j]==0)
                {
                    visited[i][j]=1;
                    q.add(new Node(i,j,0));
                }else{
                    visited[i][j]=0;
                }
            }
        }
        int rowDiff[]={0,-1,0,1};
        int colDiff[]={-1,0,1,0};
        while(!q.isEmpty())
        {
            int row=q.peek().row;
            int col=q.peek().col;
            int distance=q.peek().distance;
            q.remove();
            dist[row][col]=distance;

            for (int i=0;i<4;i++)
            {
                int nr=row+rowDiff[i];
                int nc=col+colDiff[i];
                if (nr>=0 && nr<m && nc>=0 && nc<n && visited[nr][nc]==0){
                    q.add(new Node(nr,nc,distance+1));
                    visited[nr][nc]=1;
                }
            }
        }
        return dist;
    }
}
