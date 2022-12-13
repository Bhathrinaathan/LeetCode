class Solution {
    public int minFallingPathSum(int[][] mat) {
        int minSum=Integer.MAX_VALUE;
        int N=mat.length;
        for (int i=0;i<N;i++)
        {
            for (int j=0;j<N;j++)
            {
                if (j==0 && i>0)
                    mat[i][j]+=Math.min(mat[i-1][j],mat[i-1][j+1]);
                else if (j==N-1 && i>0)
                    mat[i][j]+=Math.min(mat[i-1][j-1],mat[i-1][j]);
                else if (i>0)
                    mat[i][j]+=Math.min(mat[i-1][j-1],Math.min(mat[i-1][j],mat[i-1][j+1]));
                if (i==N-1 && minSum>mat[i][j])
                        minSum=mat[i][j];
             }
        }
        return minSum;
    }
}
